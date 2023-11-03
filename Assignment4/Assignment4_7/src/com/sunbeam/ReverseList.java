package com.sunbeam;

public class ReverseList {

	public class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head;
	private Node tail;
	public ReverseList() {
		head = null;
		tail=null;
	}
	
	public boolean isEmpty() {
		return head == null && tail==null;
	}
	
	public void addFirst(int value) {
		
		Node newnode = new Node(value);
		
		if(isEmpty()) {
			tail=newnode;
			head = newnode;
		}
		else {
		
			newnode.next = head;
		     
			head = newnode;
			
		}
	}
	public void revdisplay(Node trav) {
		if(trav==null)
			return;
		revdisplay(trav.next);
		System.out.print(" "+trav.data);
		
	}
	void revdisplay() {
		System.out.println("");
		System.out.println("reverse list:");
		revdisplay(head);
		
	}
	public void forwardDisplay(Node trav) {
		
		if(trav==null)
			return;
		System.out.print(" "+trav.data);
		forwardDisplay(trav.next);
	}
	public void forwardDisplay() {
		System.out.println("Forward list:");
		forwardDisplay(head);
	}
}
