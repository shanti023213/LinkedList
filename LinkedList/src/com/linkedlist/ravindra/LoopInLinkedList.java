package com.linkedlist.ravindra;

public class LoopInLinkedList {

	public static void main(String[] args) {

		
		LinkedList list = new LinkedList();
		
		 list.head = new Node(50);
	     list.head.next = new Node(20);
	     list.head.next.next = new Node(15);
	     list.head.next.next.next = new Node(4);
	     list.head.next.next.next.next = new Node(10);
	 
	     // 50->20>15>4>10 (10 to 15 loop)
	        // Creating a loop for testing 
	      list.head.next.next.next.next.next = list.head.next.next;
		
		findLoopInLinkedList(list);
		findStartOfLoop(list);
	}
	
	public static void findLoopInLinkedList(LinkedList list){
		
		
		Node fast =list.head;
		Node slow= list.head;
		
		while(fast!=null && fast.next!=null){
		
			slow = slow.next;
			fast = fast.next.next;
			if(fast==slow){
				
				System.out.println("Loop found");
				break;
			}
		}
	} 

	public static void findStartOfLoop(LinkedList list){
		
		
		Node fast =list.head;
		Node slow= list.head;
		
		while(fast!=null && fast.next!=null){
			
			
			slow = slow.next;
			fast = fast.next.next;
			
			if(fast==slow){
				
				System.out.println("Loop found");
				break;
			}
			
		
		}
		
		slow = list.head;
		
		while(slow!=fast){
			
			slow= slow.next;
			fast=fast.next;
			
			
		}
		
		System.out.println("Loop found at" +slow.data);
	} 
}
