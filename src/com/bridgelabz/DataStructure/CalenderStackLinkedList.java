package com.bridgelabz.DataStructure;

public class CalenderStackLinkedList {
	static CalenderStackNode top=new CalenderStackNode();
	static CalenderStackNode head=new CalenderStackNode();
	static CalenderStackNode headSecondStack=new CalenderStackNode();
	static CalenderStackNode topSecondStack =new CalenderStackNode();
	static void push(int d,int TotalDays)
	{
		String day[]= {"Sunday","Monday","Thuesday","Wednesday","Thursday","Friday","Saturday"};
		System.out.print(d+" "+TotalDays);
		int count=0;
		while(count<d)
		{
			CalenderStackNode node=new CalenderStackNode();
			node.date=0;
			node.weekday=day[count];
			if(d==0 && count==0){
				node.date=1;
				top=node;
				head=node;
				System.out.print(node.date);
			}
			else
			{
				System.out.print(node.date);
				node.next=head;
				head=node;
				top=node;
			}
			count++;
		}
		int j;
		if(d==0)
			j=2;
		else
			j=1;

		for(int i=j;i<=TotalDays;i++)
		{
			CalenderStackNode node=new CalenderStackNode();
			node.date=i;
			node.weekday=day[count];
			node.next=head;
			System.out.print(node.date);
			head=node;
			top=node;
			count++;
			if(count%7==0)
				count=0;
		}
	}
	static void push(CalenderStackNode nodeDate)
	{
		CalenderStackNode node=new CalenderStackNode();
		node.date=nodeDate.date;
		node.weekday=nodeDate.weekday;
		
		if(headSecondStack==null)
		{
			headSecondStack=node;
			topSecondStack=node;
		}
		else
		{
			node.next=headSecondStack;
			topSecondStack=node;
			headSecondStack=node;
		}
		
		
	}
	static CalenderStackNode pop(CalenderStackNode t)
	{
		CalenderStackNode current=t;
		top=current.next;
		
		return current;
	}
	
}
