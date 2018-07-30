package com.linkedlist.ravindra;

public class GreatestNodeOnRightSide {

	public static void main(String[] args) {
	

		
		SpecialNode head = new SpecialNode(5);
		head.next= new SpecialNode(10);
		head.next.next=new SpecialNode(3);
		head.next.next.next=new SpecialNode(20);
		head.next.next.next.next=new SpecialNode(2);
		head.next.next.next.next.next=new SpecialNode(11);
		
		greatestNodeRightSide(head);

	}
	
	public static void greatestNodeRightSide(SpecialNode node){
		
		SpecialNode temp = reverse(node);
		SpecialNode head = temp;
		SpecialNode greatest = temp;
		
		while(temp!=null){
			
			if(greatest.data<temp.data){
				
				greatest = temp;
			}
			
			temp.random = greatest;
			temp = temp.next;
		}
		
	 temp = reverse(head);

		printLinkedlist(temp);
	}
	
	public static void printLinkedlist(SpecialNode node){
		
		SpecialNode currentNode = node;
		
		while(currentNode!=null){
			
			System.out.println("Node="+ currentNode.data+ "Random element"+ currentNode.random.data);
			currentNode =currentNode.next;
		}
	}
	
	
	
	public static SpecialNode reverse(SpecialNode node){
		
		
		SpecialNode previous = null;
		SpecialNode next =null;
		SpecialNode current = node;
		
		while(current!=null){
			
			next = current.next;
			current.next=previous;
			previous =current;
			current =next;
		}
		return previous;
	}

}
