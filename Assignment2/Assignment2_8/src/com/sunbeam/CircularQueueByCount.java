package com.sunbeam;

public class CircularQueueByCount {
	private int arr[];
	private int rear, front;
	private final int SIZE;
	int count=0;
	public CircularQueueByCount(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = -1;
		rear = -1;
	}
	public void push(int data) {
		count++;
		rear = (rear + 1) % SIZE;
	
		arr[rear] = data;
	}
	
	public void pop() {
	     count--;
		front = (front + 1) % SIZE;
		if(front == rear)
			front = rear = -1;
	}
	public int peek(){
		return arr[(front+1)%SIZE];
		
	}
	public boolean isFull() {
		return count==SIZE;
		
	}
	public boolean isEmpty() {
		return count==0;
	}
}
