package com.sunbeam;

import java.util.Scanner;

public class Stack {
	SinglyLinearLinkedList l1;
	Stack(){
		l1=new SinglyLinearLinkedList();
	}
	public boolean isEmpty(){
		return l1.isEmpty();
		
	}
public void push(int value) {
	l1.addFirst(value);
	
}
public void pop() {
	l1.deleteFirst();

}
public int peek() {
	return l1.getData();
	
}


public static void main(String[] args) {
	Stack st=new Stack();
	int choice;
	Scanner sc=new Scanner(System.in);
	
	do {
		System.out.println("0.exit\n 1.push \n 2.pop \n 3.peek");
		System.out.println("Enter your choice:");
		 choice=sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter data:");
			int data=sc.nextInt();
			st.push(data);
			break;
		case 2:
			if(st.isEmpty())
				System.out.println("Stack is empty");
			else
				st.pop();
					
					break;
		case 3:if(st.isEmpty())
			System.out.println("Stack is empty");
		else
			System.out.println("Peeked data= " +st.peek());
			
			break;

		
		}
		
	}while(choice!=0);
}

}