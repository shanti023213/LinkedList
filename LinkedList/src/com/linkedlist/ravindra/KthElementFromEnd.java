package com.linkedlist.ravindra;

public class KthElementFromEnd {

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
		
		findElementkDistanceFromEnd(list,3);
		
	}
	
	public static void findElementkDistanceFromEnd(LinkedList list , int k){
		
		Node p = list.head;
		Node q = list.head;
		for(int i=0;i<k;i++){
			
			if(p!=null){
				
				p=p.next;
			}else{
				
				System.out.println("Not enough elements");
				return;
			}
		}
			
		if(p!=null){
			while(p!=null){
				
				p =p.next;
				q=q.next;
			}
			
			System.out.println("kth element from last=" +q.data);
		}
	}
		
	}

