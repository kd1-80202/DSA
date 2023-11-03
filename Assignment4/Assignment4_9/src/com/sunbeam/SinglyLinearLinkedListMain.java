package com.sunbeam;

public class SinglyLinearLinkedListMain {

	public static void main(String[] args) {
List l1 = new List();
		
		l1.addFirst(40);
	
		l1.addFirst(30);
		
		l1.addFirst(20);
		
		l1.addFirst(10);
		l1.displayList();
		
		System.out.println("smallest Element"+l1.smallestElement());
		System.out.println("largest Element"+l1.largestElement());
		

	}

}