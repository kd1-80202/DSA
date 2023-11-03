package com.sunbeam;
//Write two different functions which return maximum
//and minimum value from the linked list respectively.
public class List {
	public class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private static Node head;
	
	public List() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addFirst(int value) {
		
		Node newnode = new Node(value);
		
		if(isEmpty())
			
			head = newnode;
		
		else {
			
			newnode.next = head;
			
			head = newnode;
		}
		
	}
	static int largestElement(Node head) {
		
		int max=Integer.MIN_VALUE;
		
		while(head!=null) {
			if(max<head.data)
				max=head.data;
			head=head.next;
		}
		return max;
		
	}
	static int largestElement() {
		System.out.println("Largest Element: ");
		int max=largestElement(head);
		return max;
		
	}
	
	static int smallestElement(Node head) {
		int min=Integer.MAX_VALUE;
		while(head!=null) {
			if(min>head.data)
				min=head.data;
			
			head=head.next;
		}
		
		return min;
		
	}
	static int smallestElement() {
		System.out.println("smallest Element: ");
		int min=smallestElement(head);
		return min;
		
	}
	
	
	public void displayList() {
		
		Node trav = head;
		System.out.print("List :");
		while(trav != null) {
			
			System.out.print("  " + trav.data);
			
			trav = trav.next;
		}
		System.out.println("");
	}

}
