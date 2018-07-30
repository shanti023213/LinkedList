package com.linkedlist.ravindra;

public class Sort0And1And2 {

	public static void main(String[] args) {
		
		Node head= new Node(0);
		head.next= new Node(0);
		head.next.next=new Node(1);
		head.next.next.next=new Node(2);
		head.next.next.next.next=new Node(1);
		head.next.next.next.next.next=new Node(2);
		head.next.next.next.next.next.next=new Node(1);
		head.next.next.next.next.next.next.next=new Node(0);
		head.next.next.next.next.next.next.next.next=new Node(0);
		head.next.next.next.next.next.next.next.next.next=new Node(2);
		head.next.next.next.next.next.next.next.next.next.next=new Node(1);
		
		seperateTheData(head);

	}
	
	
	public static void seperateTheData(Node node){
		
		int[] count = new int[3];
		
		Node temp = node;
		while(temp!=null){
			
			count[temp.data]++;
			temp= temp.next;
		}
		
		temp =node; int i=0;
		while(temp!=null){
			
			if(count[i]==0){
				i++;
			}
			temp.data=i;
			--count[i];
			temp=temp.next;
		}
		
		printUsingRecursion(node);
	}


public static void printUsingRecursion(Node temp){
	

	if(temp!=null){
		System.out.println(temp.data);
		printUsingRecursion(temp.next);
	}
	
}

	
	

}
