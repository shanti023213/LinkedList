package com.linkedlist.ravindra;

public class MovingLastNodeToFront {

	public static void main(String[] args) {
	
		LinkedList list = new LinkedList();
		
		list.insertAtEnd(5);
		list.insertAtEnd(10);
		/*list.insertAtEnd(3);
		list.insertAtEnd(20);
		list.insertAtEnd(2);
		list.insertAtEnd(11);*/
		moveLastToFirst(list);
		printLinkedlist(list);
	}
	
	public static void printLinkedlist(LinkedList list){
		
		Node currentNode = list.head;
		
		while(currentNode!=null){
			
			System.out.println(currentNode.data);
			currentNode =currentNode.next;
		}
	}
	
	public static void moveLastToFirst(LinkedList list){
		
		if(list.head != null && list.head.next !=null){
			
			Node temp = list.head;
			
			while(temp.next.next!=null){
				
				temp =temp.next;
			}
			temp.next.next = list.head;
			list.head =temp.next;
			temp.next=null;
			
			
		}
		
		
	}

}
