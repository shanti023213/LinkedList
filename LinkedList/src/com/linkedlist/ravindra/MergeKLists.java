package com.linkedlist.ravindra;

import java.util.PriorityQueue;

public class MergeKLists {

	public static void main(String[] args) {
		
		Node list1 = new Node(1);
	    list1.next = new Node(4);
		list1.next.next = new Node(7);
		list1.next.next.next = new Node(9);
		
		Node list2 = new Node(2);
	    list2.next = new Node(5);
		list2.next.next = new Node(6);
		list2.next.next.next = new Node(8);
		
		
		Node list3 = new Node(3);
	    list3.next = new Node(14);
		list3.next.next = new Node(15);
		list3.next.next.next = new Node(16);
		
		Node list4 = new Node(11);
	    list4.next = new Node(12);
		list4.next.next = new Node(13);
		list4.next.next.next = new Node(17);
		
		
		merge(list1,list2,list3,list4);

	}
	
	public static void merge(Node l1,Node l2,Node l3, Node l4){
		
		PriorityQueue<Node> queue = new PriorityQueue<Node>();
		queue.add(l1);
		queue.add(l2);
		queue.add(l3);
		queue.add(l4);

			
		Node head= queue.poll();
		Node temp = head;
		queue.add(temp.next);
		while(!queue.isEmpty()){
			Node n = queue.poll();
			System.out.println(n.data);
			temp.next = n;
			temp =temp.next;
			if(n.next!=null)
			queue.add(n.next);
		
		}
		
		System.out.println("******");
	}

	
	public static void merge1(Node l1,Node l2,Node l3, Node l4){
		
		PriorityQueue<Node> queue = new PriorityQueue<Node>(new NodeComparator());
		queue.add(l1);
		queue.add(l2);
		queue.add(l3);
		queue.add(l4);

			
		Node head= queue.poll();
		Node temp = head;
		queue.add(temp.next);
		while(!queue.isEmpty()){
			Node n = queue.poll();
			System.out.println(n.data);
			temp.next = n;
			temp =temp.next;
			if(n.next!=null)
			queue.add(n.next);
		
		}
		
		System.out.println("******");
	}
}
