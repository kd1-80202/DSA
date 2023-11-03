package com.sunbeam;

public class SortedList {
	//8. Write a function which will insert values in sorted order into linked list.
	
//	1) If Linked list is empty then make the node as
//head and return it.
//2) If the value of the node to be inserted is smaller 
//than the value of the head node, then insert the node 
//at the start and make it head.
//3) In a loop, find the appropriate node after 
//which the input node (let 9) is to be inserted. 
//To find the appropriate node start from the head, 
//keep moving until you reach a node GN (10 in
//the below diagram) who's value is greater than 
//the input node. The node just before GN is the
//appropriate node (7).
//4) Insert the node (9) after the appropriate node
//(7) found in step 3
	
	
	public class Node{
			private int data;
			private Node next;
           public Node(int value) {
				data = value;
				next = null;
			}
		}
		
		private Node head;
		
		public SortedList() {
			head = null;
		}
		
		public boolean isEmpty() {
			return head == null;
		}
	void sortedInsert(Node new_node) {
		Node trav;
		if(head==null || head.data>=new_node.data) {
			new_node.next=head;
			head=new_node;
		}
		else {
			trav=head;
			while(trav.next!=null && trav.next.data<new_node.data) {
				trav=trav.next;
			}
			new_node.next=trav.next;
			trav.next=new_node;
			
		}
	}
	
	public Node newNode(int data) {
		Node x=new Node(data);
		return x;
	}
	void printList() {
		Node trav=head;
		System.out.println("List: ");
		while(trav!=null) {
			System.out.print(trav.data+" ");
			trav=trav.next;
		}
		System.out.println("");
	}
	}

	
	
	

