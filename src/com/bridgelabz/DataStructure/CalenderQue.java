package com.bridgelabz.DataStructure;

public class CalenderQue {
	static CalenderNode front,rear;
	public static CalenderNode remove()
	{
		
		CalenderNode current=new CalenderNode();
		current=front;
		front=current.next;
		
		return current;
		
	}
	public static boolean isEmpty()
	{
		if(front==rear)
			return false;
		else
			return true;
	}
	
}
