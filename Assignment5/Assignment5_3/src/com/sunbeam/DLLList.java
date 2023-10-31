package com.sunbeam;

public class DLLList {
	public class Node{
		private int data;
		private Node next;
		private Node prev;
		public Node(int value) {
			data=value;
			next=null;
			prev=null;
		}
	}
	private Node head;
	private Node tail;
	public DLLList() {
		head=null;
		tail=null;
	}
	public boolean isEmpty() {
		return head==null && tail==null;
	}
	public void addFirst(int value)
	{
		Node nn= new Node(value);
		if(isEmpty())
			head=tail=nn;
		else {
			nn.next=head;
			head.prev=nn;
			head=nn;
		}
	}
	
	public void daleteFirst() {
		if(isEmpty())
			System.out.println("List is Empty");
		else if(head.next==null)
			head=tail=null;
		else {
			head=head.next;
			head.prev=null;
		}
		
	}
	public void deleteLast() {
		if(isEmpty())
			return;
		else if(head.next==null)
			head=null;
		else {
			tail=tail.prev;
			tail.next=null;
		}
	}
	public void Display() {
		
		Node trav = head;
		System.out.print("Forward : ");
		while(trav != null) {
			
			System.out.print(" " + trav.data);
			
			trav = trav.next;
		}
		System.out.println("");
	}
}
