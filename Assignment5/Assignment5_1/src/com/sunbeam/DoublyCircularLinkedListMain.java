package com.sunbeam;

public class DoublyCircularLinkedListMain {

	public static void main(String[] args) {
		List l1=new List();
		l1.addFirst(10);
		l1.addFirst(20);
		l1.addFirst(30);
		l1.addFirst(40);
		l1.addFirst(50);

		l1.fDisplay();
		l1.rDisplay();
		System.out.println("Node count : " + l1.getCount());
		l1.addPosition(80, 3);
		l1.fDisplay();
		l1.rDisplay();
		System.out.println("Node count add position : " + l1.getCount());
		l1.daletePosition( 3);
		l1.fDisplay();
		l1.rDisplay();
		System.out.println("Node count delete position: "+l1.getCount());
	}

}
