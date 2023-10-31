package com.sunbeam;

import java.util.Scanner;

public class Queue {
	DLLList l1;

Queue(){	
	l1=new DLLList();
}
public boolean isEmpty() {
	return l1.isEmpty();
	
}
public void push(int value) {
	l1.addFirst(value);
}
public void popFront() {
	l1.daleteFirst();
}
public void popRear() {
	l1.deleteLast();
}
public void display() {
	l1.Display();
}

public static void main(String[] args) {
	Queue q=new Queue();
	int choice;
	Scanner sc=new Scanner(System.in);
	
	do {
		System.out.println("0.exit\n 1.push data  \n 2.pop data from front \n 3.pop data from rear \n 4.display Data");
		System.out.println("Enter your choice:");
		 choice=sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter data:");
			int data=sc.nextInt();
			q.push(data);
			break;
		case 2:
			if(q.isEmpty())
				System.out.println("Stack is empty");
			else
				q.popFront();
					
					break;
		case 3:
			if(q.isEmpty())
				System.out.println("Stack is empty");
			else
				q.popRear();
					
					break;
		case 4:if(q.isEmpty())
			System.out.print("Stack is empty");
		else
			q.display();
			
			break;

		
		}
		
	}while(choice!=0);

}



}
