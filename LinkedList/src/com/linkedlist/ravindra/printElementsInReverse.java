package com.linkedlist.ravindra;

public class printElementsInReverse {

	public static void main(String[] args) {
	LinkedList list = new LinkedList();
	
	list.insertAtEnd(5);
	list.insertAtEnd(10);
	list.insertAtEnd(3);
	list.insertAtEnd(20);
	list.insertAtEnd(2);
	list.insertAtEnd(11);
	printInReverse(list.head);
	
}

public static void printInReverse(Node temp){
	
	
	
	if(temp!=null){
		printInReverse(temp.next);
		System.out.println(temp.data);
	}
}

	

}
