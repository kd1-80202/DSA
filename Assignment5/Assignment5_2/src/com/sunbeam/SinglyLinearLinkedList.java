package com.sunbeam;

public class SinglyLinearLinkedList {
  
	public class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data=value;
			next=null;
		}
	}
	
	private Node  head;
	public SinglyLinearLinkedList() {
		head=null;
	}
	public boolean isEmpty() {
		return head==null;
	}
	public void addFirst(int value) {
		Node nn=new Node(value);
		if(isEmpty())
			head=nn;
		
		else {
			nn.next=head;
			head=nn;
			
		}
	}
	public void deleteFirst() {
		if(isEmpty())
			System.out.println("List is Empty");
			else
			head=head.next;
	}
	public void daleteLast() {
		if(isEmpty())
			System.out.println("List os Empty");
		else if(head.next==null)
		head=null;
		else {
			Node trav=head;
			while(trav.next.next!=null)
				trav=trav.next;
			trav.next=null;
		}
	}
	
	public void DisplayList() {
		Node trav=head;
		System.out.println("List:");
		while(trav!=null)
		{
			System.out.print(" "+trav.data);
			trav=trav.next;
		}
		System.out.println("");
	}
	int getData() {
		return head.data;
	}
}
