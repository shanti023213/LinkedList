package com.linkedlist.ravindra;

public class AlternateSplit {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.insertAtEnd(5);
		list.insertAtEnd(10);
		list.insertAtEnd(3);
		list.insertAtEnd(20);
		list.insertAtEnd(2);
		list.insertAtEnd(11);
		list.insertAtEnd(13);
		list.insertAtEnd(120);
		list.insertAtEnd(12);
		list.insertAtEnd(111);
		
		alternateSplit(list);
		
		// 5 3 2 13 12
		//10 20 11 120 111

	}
	
	public static void alternateSplit(LinkedList list){
		
		if(list.head==null){
			return;
		}
		
		Node p = list.head;
		Node q = list.head.next;
		
		Node temp =list.head.next;
		
		while(p.next!=null){
			
			p.next = temp.next;
			p=temp;
			temp=temp.next;
			
		}
		printLinkedlist(list.head,q);
	
	}
	

	public static void printLinkedlist(Node p, Node q){
		
		Node list1 = p;
		Node list2 = q;
		
		while(list1!=null){
			
			System.out.println(list1.data);
			list1 =list1.next;
		}
		
		while(list2!=null){
			
			System.out.println(list2.data);
			list2 =list2.next;
		}	
	}

}
