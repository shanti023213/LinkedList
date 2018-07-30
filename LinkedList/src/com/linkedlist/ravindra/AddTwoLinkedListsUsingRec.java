package com.linkedlist.ravindra;

public class AddTwoLinkedListsUsingRec {
	
	static int carryOver; static Node result;

	public static void main(String[] args) {

		Node node1= new Node(1);
		node1.next= new Node(2);
		node1.next.next=new Node(3);
		node1.next.next.next=new Node(4);
		
		
		Node node2= new Node(4);
		node2.next= new Node(5);
		node2.next.next=new Node(6);
		node2.next.next.next=new Node(7);
		
	
		addLists(node1,node2);
		printLinkedlist(result);
	}
	
	public static void printLinkedlist(Node result){
		
		Node currentNode = result;
		
		while(currentNode!=null){
			
			System.out.println(currentNode.data);
			currentNode =currentNode.next;
		}
	}

	public static void addLists(Node n1, Node n2){
		
		int l1= findSize(n1);
		int l2= findSize(n2);
		int diff = Math.abs(l1-l2);
		
		if(l1==l2){
			
			addSameSizeLists(n1,n2);
		}else{
			
			Node cur; Node head ;
			
			//Always n1 should be greater than n2 or else swap
			if(l1<l2){
				
				cur = n2;
				n2=n1;
				n1=cur;
			}
			
			head = n1;
			
			while(diff>0){
				
				n1= n1.next;
				diff--;
			}
			
			cur = n1;
			addSameSizeLists(n1,n2);
			addRemainingNumSum(head, cur);
			
			if(carryOver>0){
				Node temp = new Node(carryOver);
				temp.next =result;
				result=temp;
				
			}
			
			
		}
	}
	
	public static void addRemainingNumSum(Node head, Node cur){
		
		if(head!=cur){
			
			addRemainingNumSum(head.next,cur);
			int sum = head.data+carryOver;
			carryOver = sum>=10?1:0;
			sum = sum%10;
			Node temp = new Node(sum);
			temp.next =result;
			result=temp;
			
		}
		
		
	}
	
	
	public static int findSize(Node n){
		
		int size =0;
		Node temp =n;
		
		while(temp!=null){
			
			size++;
			temp =temp.next;
		}
		
		return size;
	}
	
	public static void addSameSizeLists(Node n1, Node n2){
		
		if(n1==null)
			return;
		
		addSameSizeLists(n1.next,n2.next);
		int sum =0 ; Node temp;
		
		sum = n1.data+n2.data+carryOver;
		
		carryOver = sum>=10?1:0;
		sum = sum%10;
		
		temp = new Node(sum);
		
		if(result==null){
			
			result = temp;
		}else{
			
			temp.next =result;
			result=temp;
		}
	}
	
}
