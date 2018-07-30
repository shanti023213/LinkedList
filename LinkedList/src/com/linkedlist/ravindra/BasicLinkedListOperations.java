package com.linkedlist.ravindra;

public class BasicLinkedListOperations {

	public static void main(String[] args) {
	
		LinkedList list = new LinkedList();
		
		list.insertAtEnd(5);
		list.insertAtEnd(10);
		list.insertAtEnd(3);
		list.insertAtEnd(20);
		list.insertAtEnd(2);
		list.insertAtEnd(11);
		
		
		//list.insertAtIndex(3, 34);
		
		//list.deleteAtEnding();
		list.deleteGivenElement(11);

		printLinkedlist(list);
	}
	
	public static void printLinkedlist(LinkedList list){
		
		Node currentNode = list.head;
		
		while(currentNode!=null){
			
			System.out.println(currentNode.data);
			currentNode =currentNode.next;
		}
	}

}
