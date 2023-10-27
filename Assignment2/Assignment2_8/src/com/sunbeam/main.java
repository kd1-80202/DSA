package com.sunbeam;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		CircularQueueByCount q=new CircularQueueByCount(6);
		int choice;
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("0. Exit \n 1.Push \n 2.Pop\n 3.Peek");
			System.out.println("Enteryour choice");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				if(q.isFull())
					System.out.println("Queue is full");
				else {
					System.out.println("Enter data:");
					int data=sc.nextInt();
					q.push(data);
				}
				
				break;
			case 2:
				if(q.isEmpty())
				System.out.println("Queue is Empty");
				else
					q.pop();
							
							break;
			case 3:
				if(q.isEmpty())
					System.out.println("Queue is Empty");
				else
					System.out.println("Peeked data"+q.peek());
				
				break;

			default:
				break;
			}
			
		}while(choice!=0);
	}

}
