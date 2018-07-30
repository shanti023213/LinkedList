package com.linkedlist.ravindra;

public class LinkedList {
	
	Node head;
	
	
	public LinkedList(){
		
		head = null;
	}
	
	public void insertBeginning(int data){
		
		Node newNode = new Node(data);
		if(head==null){
			head = newNode;
		}else{
			
			newNode.next= head;
			head = newNode;
		}
		
	}

	
	public void insertAtEnd(int data){
		
		Node newNode = new Node(data);
	
		
		if(head==null){
			head = newNode;
			
		}else{
			Node current = head;
		while(current.next !=null){
			current=current.next;
		}
		current.next =newNode;
		}
		
		
	}
	
	
	public void insertAfterGivenNode(int existingNode, int newNode){
		
		Node element = new Node(newNode);
		
		if(head==null){
			System.out.println("Empty List");
		}else{
			
			if(head.data==existingNode){
				
				head.next =element;
			}else{
				
				Node current = head;
				while(current!=null && current.data != existingNode){
					
					current =current.next;
				}
				
				if(current==null){
					System.out.println("Given element not found in list");
				}else{
					element.next=current.next;
					current.next=element;
					
				}
			}
		}
		
	}
	
	
	public void insertAtIndex(int index, int data){
	
		Node newNode = new Node(data);
		Node currentNode =head;
		
		if(head==null){
			
			System.out.println("Empty List");
		}else{
			
		for(int i=0;i<index-1;i++){
	
				currentNode=currentNode.next;
			
		}
		if(index==0){
			
			newNode.next=head;
			head=newNode;
		}else{
		newNode.next=currentNode.next;
		currentNode.next=newNode;
		}
		}
	}
	
	
	public void deleteAtBegining(){
		
		if(head!=null)
		head =head.next;
		
	}
	
	public void deleteAtEnding(){
		
		if(head!=null){
			
			if(head.next==null){
				
				return;
			}
			Node currentNode= head;
			while(currentNode.next.next!=null){
				
				currentNode= currentNode.next;
		}
			currentNode.next=currentNode.next.next;
			System.out.println("********");
		}
		
		
	}
	

	public void deleteGivenElement(int data){
		
		if(head!=null){
			
			if(head.data ==data){
				
				head =null;
			}
			Node currentNode= head;
			while(currentNode.next.data!=data){
				
				currentNode= currentNode.next;
		}
			
			currentNode.next=currentNode.next.next;
			System.out.println("********");
		}
		
		
	}

}
