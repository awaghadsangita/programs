package com.bridgelabz.DataStructure;

public class CalenderLinkedList {
	public static void main(String args[])
	{
		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		
		String day[]= {"SUN","MON","THU","WEN","THR","FRI","SAT"};
		int d=UtilityCalender.dayOfWeek(1,month,year);
		
		int totalDayInMonth[]= {0,31,28,31,30,31,30,31,30,30,31,30,31};
		String Months[]= {"","January","February","March","April","May","June","July","August","September","October","November","December"};
		
		if(UtilityCalender.isLeapYear(year))
			totalDayInMonth[2]=29;
		
		CalenderLinkedlist list=new CalenderLinkedlist();
		list.insert(d);
//		CalenderLinkedlist.show();
		System.out.println("   "+Months[month]+" "+year);
		
		for(int i=0;i<7;i++)
			System.out.print(day[i]+" ");
		System.out.print("\n");
	
		int count=0;
		
		CalenderNode dateNode=new CalenderNode();
		CalenderQue.front=CalenderLinkedlist.head;
		while(dateNode.date==0)
		{
			if(CalenderQue.front!=CalenderQue.rear)
			{
				dateNode=CalenderQue.remove();
				if(dateNode.date==0)
				System.out.print("    ");
				count++;
			}
		}
		System.out.print(dateNode.date+"   ");;
		for(int i=1;i<=totalDayInMonth[month];i++)
		{
			
			
			if(CalenderQue.front!=CalenderQue.rear)
				dateNode=CalenderQue.remove();
			else
				break;
			if(i<10)
				System.out.print(dateNode.date+"   ");
			else
				System.out.print(dateNode.date+"  ");
			count++;
			if(count%7==0)
				System.out.print("\n");	
		}
		
		
	}
}
