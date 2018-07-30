package com.linkedlist.ravindra;


public class AddTwoLinkedLists {

	public static void main(String[] args) {
	
		Node node1= new Node(1);
		node1.next= new Node(2);
		node1.next.next=new Node(3);
		node1.next.next.next=new Node(4);
		
		
		Node node2= new Node(4);
		node2.next= new Node(5);
		node2.next.next=new Node(6);
		node2.next.next.next=new Node(7);
	
		addListandList2(node1,node2);

	}
	
	public static void addListandList2(Node node1, Node node2){
		
		Node temp1 = reverse(node1);
		Node temp2 = reverse(node2);
		
		int a , b,sum, carryOver=0; Node temp=null; Node head=null;
		
		while(temp1!=null || temp2!=null){
			 
			a= temp1!=null?temp1.data:0;
			b= temp2!=null?temp2.data:0;
			
			sum = a+b+carryOver;
			carryOver = sum>=10?1:0;
			temp = new Node(sum%10);
			
			if(head==null){
				
				head =temp;
			}else{
				temp.next=head;
				head=temp;
			}
			
			temp1= temp1!=null?temp1.next:null;
			temp2= temp2!=null?temp2.next:null;
			
		}
		if(carryOver>0){
			
			temp= new Node(carryOver);
			temp.next=head;
			head=temp;
		}
		System.out.println("*********");
	}
	
	public static Node reverse(Node node){
		
		Node previous = null;
		Node current = node;
		Node next = null;
		
		while(current!=null){
			
			next = current.next;
			current.next =previous;
			previous= current;
			current= next;
		}
		return previous;
	}

}
