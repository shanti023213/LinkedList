package com.linkedlist.ravindra;

public class PrintListUsingRec {

	public static void main(String[] args) {
	

		LinkedList list = new LinkedList();
		
		list.insertAtEnd(5);
		list.insertAtEnd(10);
		list.insertAtEnd(3);
		list.insertAtEnd(20);
		list.insertAtEnd(2);
		list.insertAtEnd(11);
		Node temp = list.head;
		printUsingRecursion(temp);
	}
	
	public static void printUsingRecursion(Node temp){
		
	
		if(temp!=null){
			System.out.println(temp.data);
			printUsingRecursion(temp.next);
		}
		
	}
	
}
