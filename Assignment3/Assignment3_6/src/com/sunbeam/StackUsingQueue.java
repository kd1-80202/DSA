package com.sunbeam;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	Queue<Integer> main = new LinkedList<>();
    Queue<Integer> temp = new LinkedList<>();
	
  public void push(int val) {
		while(!main.isEmpty())
			temp.offer(main.poll());
		main.offer(val);
		while(!temp.isEmpty())
			main.offer(temp.poll());
	}
  public int pop() {
	  if(!main.isEmpty()) 
		  return main.poll();
	  else {
		  System.out.println("Stack is Empty");
	  }
	return 0;
  }
  public int top() {
	  if(!main.isEmpty()) 
		  return main.peek();
	  else {
		  System.out.println("Stack is Empty");
  }
	return 0;
  }
		public static void main(String[] args) {
			
			StackUsingQueue stack=new StackUsingQueue();
			stack.push(10);
			stack.push(20);
			stack.push(30);
			System.out.println("Top element: " + stack.top());
	        System.out.println("Popped element: " + stack.pop());
	        System.out.println("Top element after one pop: " + stack.top());	
	}
}
