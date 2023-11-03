package com.sunbeam;

import java.util.Scanner;

public class MaxInStackMain {
	
	
int choice;

Scanner sc  = new Scanner(System.in);
do {
	System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek \n 4.Reverse Array");
	System.out.print("Enter your choice : ");
	choice = sc.nextInt();
	switch(choice)
	{
	case 1:
		if (st.isFull())
			System.out.println("Stack is full");
		else {
			int arr[]= new int [4];
			for(int i=0;i<arr.length;i++) {
				System.out.println("Enter a ele in Array");
				arr[i]=sc.nextInt();
				st.push(arr[i]);
			}
			

		}
		break;
	case 2:
		if(st.isEmpty())
			System.out.println("Stack is empty");
		else
			System.out.println("Poped Data = " + st.pop());
		break;
	case 3:
		if(st.isEmpty())
			System.out.println("Stack is empty");
		else
			System.out.println("Peeked Data = " + st.peek());
		break;
	case 4:Stack<Integer> st=new Stack<>();

		if(st.isEmpty())
			System.out.println("Stack is empty");
		else
			System.out.println("Max Data = " + st.peek());
		break;
	}
}while(choice != 0);

sc.close();
}


}
