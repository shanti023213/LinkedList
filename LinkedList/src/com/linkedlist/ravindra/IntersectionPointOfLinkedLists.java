package com.linkedlist.ravindra;

public class IntersectionPointOfLinkedLists {

	public static void main(String[] args) {
		
		  LinkedList list1 = new LinkedList();
		  
	        // creating first linked list
	        list1.head = new Node(3);
	        list1.head.next = new Node(6);
	        list1.head.next.next = new Node(9);
	        list1.head.next.next.next = new Node(15);
	        list1.head.next.next.next.next = new Node(30);
	        
	        //3->6->9->15->30
	 
	        // creating second linked list
	        LinkedList list2 = new LinkedList();
	        list2.head = new Node(10);
	        list2.head.next = list1.head.next.next.next;
	        list2.head.next.next = new Node(30);
	        
	        //10->15->30
	        
	        int intersectionPoint = findIntersectionPoint(list1,list2);

	        System.out.println("Intersection Point"+intersectionPoint);
	}

	public static int findIntersectionPoint(LinkedList list1, LinkedList list2){
		
		int l1 = findLength(list1);
		int l2 = findLength(list2);
		
		return (l1>l2)?getIntersection(list1,list2,l1-l2):getIntersection(list2,list1,l2-l1);
		
		
		
	}
	
	public static int getIntersection(LinkedList longlist, LinkedList shortlist, int diff){
		
		
		Node p = longlist.head;
		Node q = shortlist.head;
		
		
		for(int i=0;i<diff ;i++){
			
			if(p!=null){
				p =p.next;
			}
		}
		
		while(p!=null & q!=null){
			
			if(p==q){
				
				break;
			}
			p=p.next;
			q=q.next;
		}
		return p.data;
	}
	
	public static int findLength(LinkedList list){
		
		Node temp = list.head;
		int length =0;
		
		while(temp!=null){
			length++;
			temp =temp.next;
		}
		
		return length;
	}
}
