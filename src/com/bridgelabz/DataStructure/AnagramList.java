package com.bridgelabz.DataStructure;

public class AnagramList {
	static AnagramNode HEAD=new AnagramNode();
	static AnagramNode FRONT=new AnagramNode();
	static AnagramNode REAR=new AnagramNode();
	public static void add(int firstnumber,int secondnumber)
	{
		AnagramNode newNode=new AnagramNode();
		newNode.FirstNumber=firstnumber;
		newNode.SecondNumber=secondnumber;
		if(HEAD==null)
		{
			HEAD=newNode;
//			FRONT=newNode;
			REAR=newNode;
		}
		else
		{
			AnagramNode temp=HEAD;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
			REAR=newNode;
		}
	}
	public static AnagramNode remove()
	{
		AnagramNode current=FRONT;
		FRONT=current.next;
		return current;
	}
	public static void show()
	{
		AnagramNode temp=HEAD;
		while(temp!=null)
		{
			System.out.println(temp.FirstNumber+ " "+temp.SecondNumber);
			temp=temp.next;
		}
	}
	public static boolean isEmpty()
	{
		if(FRONT==null)
			return true;
		
		return false;
	}
}
