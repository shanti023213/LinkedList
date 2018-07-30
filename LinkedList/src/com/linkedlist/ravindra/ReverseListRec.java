package com.linkedlist.ravindra;

public class ReverseListRec {
	
	static LinkedList list = new LinkedList();

	public static void main(String[] args) {
		
		
		
		list.insertAtEnd(5);
		list.insertAtEnd(10);
		list.insertAtEnd(3);
		list.insertAtEnd(20);
		list.insertAtEnd(2);
		list.insertAtEnd(11);
		reversetheListRec(null, list.head);
		printLinkedlist(list);
	}
	
	public static void printLinkedlist(LinkedList list){
		
		Node currentNode = list.head;
		
		while(currentNode!=null){
			
			System.out.println(currentNode.data);
			currentNode =currentNode.next;
		}
	
	}
	
	public static void reversetheListRec(Node prev, Node current){
		
		if(current!=null){
			
			reversetheListRec(current,current.next);
			current.next=prev;
		}
		else
		list.head =prev;
	}

}
