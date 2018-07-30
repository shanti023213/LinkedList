package com.linkedlist.ravindra;

public class Palindrome {

	public static void main(String[] args) {
	

		LinkedList list = new LinkedList();
		
		list.insertAtEnd(5);
		list.insertAtEnd(10);
		list.insertAtEnd(3);
		list.insertAtEnd(3);
		list.insertAtEnd(10);
		list.insertAtEnd(5);

		findMiddleElement(list);
		printLinkedlist(list);
	}
	
	public static void printLinkedlist(LinkedList list){
		
		Node currentNode = list.head;
		
		while(currentNode!=null){
			
			System.out.println(currentNode.data);
			currentNode =currentNode.next;
		}
	}
	
	
	
	public static void findMiddleElement(LinkedList list){
		
		Node fast = list.head;
		Node slow = list.head;
		Node previousSlow = list.head;
		
		while(fast!=null && fast.next!=null){
			
			fast = fast.next.next;
			previousSlow = slow;
			slow = slow.next;
			
			
		}
		
		//System.out.println(previousSlow.data);
		
		previousSlow.next=null;
		Node secondList = reverse(slow);
		
		boolean isPalindrome = findPalindrome(list.head, secondList);
		
		Node finalList = reverse(secondList);
		previousSlow.next=finalList;
	
	}
	
	public static Node reverse(Node head){
		

		
		Node currentNode = head;
		Node previousNode=null ,nextNode =null;
		
		while(currentNode!=null){
				nextNode =currentNode.next;
				currentNode.next =previousNode;
				previousNode=currentNode;
				currentNode=nextNode;
			
		}
		
		return previousNode;
	
	}

	public static boolean findPalindrome(Node firstList, Node secondList){
		
		while(firstList!=null && secondList!=null){
			
			if(firstList.data ==secondList.data){
				firstList= firstList.next;
				secondList= secondList.next;
		
			}else{
				System.out.println("Not a palindrome");
				return false;
			}
		}
		
		if(firstList==null){
			return true;
		}
		
		return false;
	}
}
