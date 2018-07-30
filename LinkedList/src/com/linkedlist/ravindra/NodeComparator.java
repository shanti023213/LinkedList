package com.linkedlist.ravindra;

import java.util.Comparator;

public class NodeComparator implements Comparator<Node>{

	@Override
	public int compare(Node n1, Node n2) {
		return n1.data-n2.data;
	}
}
