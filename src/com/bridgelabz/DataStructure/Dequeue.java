package com.bridgelabz.DataStructure;

public class Dequeue {

	public static final int MAX=100;
	int rear,front;
	int que[]=new int[100];
	Dequeue()
	{
		rear=-1;
		front=-1;
	}
	void addFront(int item)
	{
		if(rear==MAX-1||front==rear)
			System.out.println("Queue Overflow...");
		else
			que[++rear]=item;
		
	}
	void addRear(int item)
	{
		if(front==MAX-1||front==rear)
			System.out.println("Queue Overflow...");
		else
			que[++front]=item;
		
	}
	boolean isEmpty()
	{
		if(front==-1)
			return false;
		else
			return true;
	}
	int removeFront()
	{
		int item;
		if(f)
		return item;
	}
//	int removeFront()
//	{
//		int item;
//		return item;
//	}
}
