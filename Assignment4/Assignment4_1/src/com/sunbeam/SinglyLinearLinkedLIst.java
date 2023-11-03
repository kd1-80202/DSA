package com.sunbeam;

public class SinglyLinearLinkedLIst {

	public static void main(String[] args) {
		List l1= new List();
		l1.addFirst(40);
		l1.addFirst(30);
		l1.addFirst(20);
		l1.addFirst(10);
		l1.addFirst(50);
		l1.displayList();
		l1.addlast(80);
		l1.displayList();
		l1.deleteFirst();
		l1.displayList();
		l1.deleteLast();
		l1.displayList();
		l1.deleteAll();
	}

}
