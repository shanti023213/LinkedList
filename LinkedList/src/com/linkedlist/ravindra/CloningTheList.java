package com.linkedlist.ravindra;


public class CloningTheList {
	
	public static void main(String[] args) {
		SpecialNode head = new SpecialNode(10);
		head.next= new SpecialNode(20);
		head.next.next= new SpecialNode(30);
		head.next.next.next= new SpecialNode(40);
		
		head.random = head.next.next;
		head.next.random = head.next.next.next;
		head.next.next.random = head.next;	
		head.next.next.next.random = head;
		System.out.println("**********");
		
		closeList(head);
	}
	
	public static void closeList(SpecialNode head){
		
		SpecialNode temp = head;
		
		//SpecialNode finalList = head;
		
		while(temp!=null){
			SpecialNode node = new SpecialNode(temp.data);
			node.next= temp.next;
			temp.next=node;
			temp=node.next;
		}
		
		SpecialNode randomTemp= head;
		
		while(randomTemp!=null){
			randomTemp.next.random=randomTemp.random.next;
			
			randomTemp =randomTemp.next.next;
			
		}
		
		SpecialNode p = head;
		SpecialNode q= head.next;
		SpecialNode tempNode =q;
		
		while(p.next!=null){
			
			p.next = tempNode.next;
			p=tempNode;
			tempNode=tempNode.next;
			
		}
		
		System.out.println("************");
	
	}

}
