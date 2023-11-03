package com.sunbeam;



public class ResverseLinkedList {
	private class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next=null;
		}
	}
private Node head;
public ResverseLinkedList() {
	head=null;
}
public boolean isEmpty(){
	
	return head==null;
	
}
public void addNode(int data) {
	Node newnode=new Node(data);
	if(isEmpty()) {
		head=newnode;
	}
	else
	{
		Node trav=head;
		while(trav.next!=null) {
			trav=trav.next;
		}
		trav.next=newnode;
	}
}
public void reverseLinkedList() {
	if(head==null)
	{
		System.out.println("List is empty.");
		return;
	}
	Node t1=head;
	Node t2=head.next;
	head.next=null;
	while(head!=null) {
		head=t2.next;
		t2.next=t1;
		t1=t2;
		t2=head;
	}
	head=t1;
	
}



public void display() {
	Node trav=head; System.out.print("List:");
	while(trav!=null) {
		System.out.print(trav.data+" ");
		trav=trav.next;
	}
	System.out.println();
}
	
}
