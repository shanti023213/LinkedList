package com.linkedlist.ravindra;



public class Node implements Comparable<Node>{
	
	int data;
	Node next;
	
	public Node(){
		
	}
	
	public Node(int data){
		
		this.data = data;
	}

	@Override
	public int compareTo(Node node) {
		// TODO Auto-generated method stub
		return this.data-node.data;
	}

}
