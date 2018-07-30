package com.linkedlist.ravindra;

public class MiddleElement {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.insertAtEnd(5);
		list.insertAtEnd(10);
		list.insertAtEnd(3);
		list.insertAtEnd(20);
		list.insertAtEnd(2);
		list.insertAtEnd(11);
		findMiddleElement(list);

	}
	
	public static void findMiddleElement(LinkedList list){
		
		if(list.head==null) 
			return;
		Node slow = list.head;
		Node fast = list.head;
		
		while(fast.next!=null && fast.next.next!=null){
			
			slow= slow.next;
			fast=fast.next.next;
		}
		
		System.out.println(slow.data);
	}

}
