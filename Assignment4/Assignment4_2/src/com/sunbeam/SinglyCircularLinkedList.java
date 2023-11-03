package com.sunbeam;

public class SinglyCircularLinkedList {

	public static void main(String[] args) {
		List l1=new List();
		l1.addFirst('s');
		l1.addFirst('u');
		l1.addFirst('n');
		l1.addFirst('b');
		l1.addFirst('e');
		l1.displayList();
		System.out.println("Node count"+l1.getCount());
		l1.addLast('a');
		l1.displayList();
		System.out.println("Node count"+l1.getCount());
		l1.addPosition('f',3);
		l1.displayList();
		System.out.println("Node count"+l1.getCount());
		
		l1.deleteLast();
		l1.displayList();
		System.out.println("Node count"+l1.getCount());
		
		l1.deletePosition(3);
		l1.displayList();
		System.out.println("Node count"+l1.getCount());

		
	}

}
