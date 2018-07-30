package com.linkedlist.ravindra;

public class MergeTwoSortedLists {

	public static void main(String[] args) {

		LinkedList list1 = new LinkedList();
		
		list1.insertAtEnd(3);
		list1.insertAtEnd(5);
		list1.insertAtEnd(10);
		
		LinkedList list2 = new LinkedList();
		list2.insertAtEnd(2);
		list2.insertAtEnd(7);
		list2.insertAtEnd(11);
		

		mergeLists(list1,list2);
	}
	
	public static void mergeLists(LinkedList list1, LinkedList list2){
		
		if(list1.head==null){
			
			printLinkedlist(list1.head);
		}else if(list2.head==null){
			
			printLinkedlist(list2.head);
		}
		
		Node l1 = list1.head;
		Node l2= list2.head;
		
		Node head ;
		Node temp;
		
		if(l1.data<l2.data){
			
			head = l1;
			temp =head;
			l1 = l1.next;
		}else{
			
				head = l2;
				temp =head;
				l2 = l2.next;
			
		}
		
		while(l1!=null && l2!=null){
			
			if(l1.data<l2.data){
				temp.next= l1;
				temp =temp.next;
				l1 =l1.next;
				
			}else{
				temp.next=l2;
				temp =temp.next;
				l2 =l2.next;
			
				
			}
			
		}
		if(l1==null){
			
			temp.next=l2;
		}
		if(l2==null){
			
			temp.next=l1;
		}
		
		printLinkedlist(head);
	}
	
	public static void printLinkedlist(Node head){
		
		Node currentNode = head;
		
		while(currentNode!=null){
			
			System.out.println(currentNode.data);
			currentNode =currentNode.next;
		}
	}

}
