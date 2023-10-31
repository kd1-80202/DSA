package com.sunbeam;

import java.util.Scanner;

public class Queue {
	
	SinglyLinearLinkedList l1;
	
	Queue(){	
		l1=new SinglyLinearLinkedList();
	}
	public boolean isEmpty() {
		return l1.isEmpty();
		
	}
	public void Enque(int value) {
		l1.addFirst(value);
	}
	public void Deque() {
		l1.daleteLast();
	}
	public void display() {
		l1.DisplayList();
	}

	public static void main(String[] args) {
		Queue q=new Queue();
		int choice;
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("0.exit\n 1.Enque \n 2.Deque \n 3.display");
			System.out.println("Enter your choice:");
			 choice=sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter data:");
				int data=sc.nextInt();
				q.Enque(data);
				break;
			case 2:
				if(q.isEmpty())
					System.out.println("Stack is empty");
				else
					q.Deque();
						
						break;
			case 3:if(q.isEmpty())
				System.out.print("Stack is empty");
			else
				q.display();
				
				break;

			
			}
			
		}while(choice!=0);

	}

}
