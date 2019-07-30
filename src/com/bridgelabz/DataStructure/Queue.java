package com.bridgelabz.DataStructure;

public class Queue {
	public int amount;
	public int rear,front;
	public static final int MAX=100;
	public int que[]=new int[MAX];
	public int count=0;
	
	public Queue()
	{
		rear=-1;
		front=-1;
	}
	public boolean isEmpty()
	{
		if(rear==front)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isFull()
	{
		if(rear==MAX-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void enqueue()
	{
		que[++rear]=count++;
	}
	int dequeue()
	{
		count--;
		return que[++front];
	}
	int size()
	{
		return rear-front;
	}
	public void showQue()
	{
		System.out.println("Queue Status");
		int temp=rear;
		int tmpFront=front+1;
		for(int i=tmpFront;i<=rear;i++)
		System.out.print(que[i]+" ");
		System.out.println();
	}
}
