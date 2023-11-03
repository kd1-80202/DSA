package com.sunbeam;

public class Test {

	public static void main(String[] args) {
		ResverseLinkedList f1=new ResverseLinkedList();
		f1.addNode(1);
		f1.addNode(2);
		f1.addNode(3);
		f1.addNode(4);
		f1.addNode(5);
		f1.addNode(6);
		f1.addNode(7);
		
		f1.display();
		
		f1.reverseLinkedList();
		
		f1.display();

	}

}
