package com.linkedlist.ravindra;

public class Test {
	
	static Node result;
	public static void main(String[] args) {

		Node node1= new Node(1);
		node1.next= new Node(2);
		node1.next.next=new Node(3);
		node1.next.next.next=new Node(4);
		
		
		Node node2= new Node(4);
		node2.next= new Node(5);
		node2.next.next=new Node(6);
		node2.next.next.next=new Node(7);
		node2.next.next.next.next=new Node(9);
		
		
		addLists(node1,node2);
		//printLinkedlist(result);
	}
	
	public static void addLists(Node n1, Node n2){
		
		int l1 = findLength(n1);
		int l2 = findLength(n2);
		
		if(l1==l2){
			addListsOfSameLength(n1,n2);
		}else{
			if(l1>l2){
				n2= paddZeros(n2,l1-l2);
			}else{
				n1 =paddZeros(n1,l2-l1);
			}
			addListsOfSameLength(n1,n2);
		}
		
		Node n = result;
		while(n!=null){
			System.out.println(n.data);
			n=n.next;
		}
	}

	
	public static int findLength(Node n1){
		int length =0;
		while(n1!=null){
			length++;
			n1=n1.next;
		}
		return length;
	}
	
	public static int addListsOfSameLength(Node n1,Node n2){
		
		int carryOver =0;
		if(n1!=null){
			 carryOver = addListsOfSameLength(n1.next, n2.next);
			int sum  = n1.data+n2.data+carryOver;
			carryOver = sum>=10?sum/10:0;
			sum = sum>=10?sum%10:sum;
			Node newNode = new Node(sum);
			newNode.next = result;
			result= newNode;
		}
		return carryOver;
	}
	
	public static Node paddZeros(Node n, int k){
		
		int i=0;
		while(i<k){
			Node n1 = new Node(0);
			n1.next = n;
			n=n1;
			i++;
		}
		return n;
	}
}
