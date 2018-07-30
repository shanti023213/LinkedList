package com.linkedlist.ravindra;

public class MergeSort {

	public static void main(String[] args) {
		
		Node node1= new Node(7);
		node1.next= new Node(6);
		node1.next.next=new Node(5);
		node1.next.next.next=new Node(4);
		node1.next.next.next.next=new Node(3);
		node1.next.next.next.next.next=new Node(2);
		node1.next.next.next.next.next.next=new Node(1);
		
	
		Node result = mergeSort(node1);
		
		printList(result);
	}

	     
	    public static Node sortedMerge(Node a, Node b) 
	    {
	        Node result = null;
	        /* Base cases */
	        if (a == null)
	            return b;
	        if (b == null)
	            return a;
	 
	        /* Pick either a or b, and recur */
	        if (a.data <= b.data) 
	        {
	            result = a;
	            result.next = sortedMerge(a.next, b);
	        } 
	        else
	        {
	            result = b;
	            result.next = sortedMerge(a, b.next);
	        }
	        return result;
	 
	    }
	 
	    public static Node mergeSort(Node h) 
	    {
	        // Base case : if head is null
	        if (h == null || h.next == null)
	        {
	            return h;
	        }
	 
	        // get the middle of the list
	        Node middle = getMiddle(h);
	        Node nextofmiddle = middle.next;
	 
	        // set the next of middle node to null
	        middle.next = null;
	 
	        // Apply mergeSort on left list
	        Node left = mergeSort(h);
	 
	        // Apply mergeSort on right list
	        Node right = mergeSort(nextofmiddle);
	 
	        // Merge the left and right lists
	        Node sortedlist = sortedMerge(left, right);
	        return sortedlist;
	    }
	 
	    // Utility function to get the middle of the linked list
	    public static Node getMiddle(Node h) 
	    {
	        //Base case
	        if (h == null)
	            return h;
	        Node fastptr = h.next;
	        Node slowptr = h;
	         
	        // Move fastptr by two and slow ptr by one
	        // Finally slowptr will point to middle node
	        while (fastptr != null)
	        {
	            fastptr = fastptr.next;
	            if(fastptr!=null)
	            {
	                slowptr = slowptr.next;
	                fastptr=fastptr.next;
	            }
	        }
	        return slowptr;
	    }
	 
	 
	    // Utility function to print the linked list
	    public static void printList(Node headref) 
	    {
	        while (headref != null) 
	        {
	            System.out.print(headref.data + " ");
	            headref = headref.next;
	        }
	    }
	     
	   
	}



