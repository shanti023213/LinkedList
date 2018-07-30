package com.linkedlist.ravindra;

import java.util.ArrayList;

public class MergeKListsBinarySearchApproach {

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
		
		
		Node result = merge(list1,list2,list3,list4);
		
		while(result!=null){
			System.out.println(result.data);
			result =result.next;
		}
		
		

	}
	
	public static Node merge(Node l1,Node l2,Node l3, Node l4){
		
		Node[] list= new Node[4];
		
		list[0]=l1;
		list[1]=l2;
		list[2]=l3;
		list[3]=l4;
		
		
		int start= 0; int end = 3; int last=end;
		
		while(last!=0){
			
			 start =0; end =last;
			while(start<end){
				list[start] =mergeLists(list[start], list[end]);
				start++;
				end--;
				if(start>end){
					last=end;
				}
			}
		}
		
		return list[0];
	}

public static Node mergeLists(Node list1, Node list2){
		
		if(list1==null){
			
			return list1;
		}else if(list2==null){
			
			return list2;
		}
		
		Node l1 = list1;
		Node l2= list2;
		
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
		return head;
}

}
