package com.linkedlist.ravindra;

public class ReverseListIterative {

	public static void main(String[] args) {
	
		LinkedList list = new LinkedList();
		
		list.insertAtEnd(5);
		list.insertAtEnd(10);
		list.insertAtEnd(3);
		list.insertAtEnd(20);
		list.insertAtEnd(2);
		list.insertAtEnd(11);
		reversetheList(list);

	
	}
	
	public static void printLinkedlist(Node node){
		
		Node currentNode = node;
		
		while(currentNode!=null){
			
			System.out.println(currentNode.data);
			currentNode =currentNode.next;
		}
	}
	
	public static void reversetheList(LinkedList list){
		
		Node currentNode = list.head;
		Node previousNode=null ,nextNode =null;
		
		while(currentNode!=null){
				nextNode =currentNode.next;
				currentNode.next =previousNode;
				previousNode=currentNode;
				currentNode=nextNode;
			
		}
		
	
		printLinkedlist(previousNode);
		
	}

}
