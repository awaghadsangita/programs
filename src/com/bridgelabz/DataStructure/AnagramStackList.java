package com.bridgelabz.DataStructure;

public class AnagramStackList {
	static AnagramNode TOP=new AnagramNode();
	static AnagramNode HEAD=new AnagramNode();
	public static void push(int firstnumber,int secondnumber)
	{
		AnagramNode newNode=new AnagramNode();
		newNode.FirstNumber=firstnumber;
		newNode.SecondNumber=secondnumber;
		
		if(HEAD==null)
		{
			HEAD=newNode;
		}
		else
		{
			newNode.next=HEAD;
			HEAD=newNode;
		}
	}
	public static AnagramNode pop()
	{
		AnagramNode current=TOP;
		TOP=TOP.next;
		return current;
	}
}
