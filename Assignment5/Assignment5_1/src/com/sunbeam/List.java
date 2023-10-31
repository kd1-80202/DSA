package com.sunbeam;

public class List {
	public class Node{
		private int data;
		private Node next;
		private Node prev;
		public Node(int value) {
			data=value;
			next=prev=null;
		}
	}
	private Node head;
	private int count;
	public List() {
		head=null;
		
	}
	public boolean isEmpty() {
		return head==null;
		
	}
	public int getCount() {
		return count;
	}
	
	public void addFirst(int value) {
		Node nn=new Node(value);
		if(isEmpty()) {
			head=nn;
			nn.next=nn;
			nn.prev=nn;
		}
		else {
			nn.next=head;
			nn.prev=head.prev;
			head.prev.next=nn;
			head.prev=nn;
			head=nn;
			
		}
		count++;
	}
	public void deleteFirst() {
		if(isEmpty()) {
			System.out.println("List is Empty");
			return;
			
		}
		else if(head.next==head)
			head=null;
		else {
			head.prev.next=head.next;
			head.next.prev=head.prev;
			head=head.next;
		}
		count--;
		
	}
		
		public void addPosition(int value , int pos) {
			
			if(pos<1|| pos> count+1)
				return;
			Node nn=new Node(value);
			if(isEmpty()){
				head=nn;
			nn.next=nn;
			nn.prev=nn;
			}
			else if(pos==1){
				addFirst(value);
				return;
			}
			else {
				Node trav=head;
				for(int i=0;i<pos-1;i++)
					trav=trav.next;
				
				nn.prev=trav;
				nn.next=trav.next;
				trav.next.prev=nn;
				trav.next=nn;
			}
			count++;
			
		}
		
	public void daletePosition(int pos)
	{
		if(pos<1 || pos>count) {
			System.out.println("List is Empty");
			return;
		}
		else if(pos==1) {
			deleteFirst();
			return;
		}
		else if(head.next==null)
			head=null;
		else {
			Node trav=head;
			for(int i=0;i<pos;i++) 
				trav=trav.next;
			trav.prev.next=trav.next;
			trav.next.prev=trav.prev;
			
		}
		count--;
		
	}
		
			
	
	public void fDisplay(){
		if(isEmpty()) 
		return; 
		
		Node trav=head;
		System.out.println("Forward List: ");
		do {
			System.out.print(" "+trav.data);
			trav=trav.next;
			
		
	}while(trav!=head);
	System.out.println("");
}
	
	public void rDisplay() {
		if(isEmpty())
			return;
		
		Node trav=head.prev;
		System.out.println("Reverse Display :");
		do {
			System.out.print(" "+trav.data);
			trav=trav.prev;
		}while(trav!=head.prev);
		System.out.println("");
	}
}


