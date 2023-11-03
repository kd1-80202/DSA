package com.sunbeam;

import com.sunbeam.SortedList.Node;

public class ListMain {

	public static void main(String[] args) {
		SortedList l1=new SortedList();
		Node new_node;
		new_node=l1.newNode(5);
     
		l1.sortedInsert(new_node);
		new_node=l1.newNode(4);
	     
		l1.sortedInsert(new_node);
		new_node=l1.newNode(10);
	     
		l1.sortedInsert(new_node);
		new_node=l1.newNode(3);
	     
		l1.sortedInsert(new_node);
		new_node=l1.newNode(9);
	    System.out.println("Created linked list");
		l1.printList();
		
		
	}

}
