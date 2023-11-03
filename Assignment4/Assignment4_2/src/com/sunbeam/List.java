package com.sunbeam;

public class List {
	public class Node{
		private char data;
		private Node next;
		private Node(char value) {
			data=value;
			next=null;
		}
	}
private Node tail;
private int count;
public List() {
	tail=null;
	count=0;
}
public int getCount() {
	return count;
	
}

public boolean isEmpty() {
	return tail==null;
	
}
public void addFirst(char value) {
	Node newnode=new Node(value);
	if(isEmpty()) {
		tail=newnode;
		tail.next=tail;
	}
	else {
		
		newnode.next=tail.next;
		tail.next=newnode;
	}
//		newnode.next=tail;
//		Node trav=tail;
//		while(trav.next!=tail)
//			trav=trav.next;
//		trav.next=newnode;
//		newnode.next=trav;
//	}	
	count++;
	}
public void addLast(char value) {
	Node newnode=new Node(value);
	if(isEmpty()) {
		tail=newnode;
		newnode.next=tail;
	}
	else {
		newnode.next=tail.next;
		tail.next=newnode;
		tail=newnode;
		}
		count++;
	}
	
	public void addPosition(char value,int pos) {
		if(pos<1 || pos>count+1) 
			return;
		
		
		Node newnode=new Node(value);
		if(isEmpty()) {
			tail=newnode;
			tail.next=tail;
		}
		else if(pos==1) {
			addFirst(value);
		}
		else {
			Node trav=tail.next;
			for(int i=1;i<pos-1;i++)
				trav=trav.next;
			
			newnode.next=trav.next;
			
			trav.next=newnode;
			if(pos==count+1) {
				tail=newnode;
			}
		}
		count++;
	}

public void  displayList() {
	if(isEmpty())
		return;
	System.out.println("List :");
	Node trav=tail.next;
	do {
		System.out.print(" "+trav.data);
		trav=trav.next;
	
}while(trav!=tail.next);
	System.out.println(" ");
}
public void deleteFirst() {
	if(isEmpty()) {
		System.out.println("List is Empty");
		return;
		
	}
	else if(tail.next==tail)
	{
		tail=null;
		
	}
	else {
		tail.next=tail.next.next;
	}
	count--;
}

public void deleteLast() {
	if(isEmpty()) {
		System.out.println("list is empty");
		return;
	}
	else if(tail.next==tail)
	{
		tail=null;
	}
	else {
		Node trav=tail.next;
		for(;trav.next.next!=tail;trav=trav.next);
		trav.next=tail;
		
	}
	count--;
	
}
public void deletePosition(int pos) {
	if(pos<1|| pos>count)
		return;
	if(isEmpty()) {
		System.out.println("List is Empty");
		return;
	}
	else if(pos==1) {
		deleteFirst();
		return;
	}
	else if(tail.next==tail)
		tail=null;
	else {
		Node trav=tail.next;
		for(int i=1;i<pos-1;i++)
			trav=trav.next;
		
		trav.next=trav.next.next;
		if(pos==count-1) {
			return ;
		}
	}
	count--;
}



}
