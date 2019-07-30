package com.bridgelabz.DataStructure;

public class CalenderStack_10 {
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
		
		CalenderStackLinkedList.push(d, totalDayInMonth[month]);
		System.out.println("   "+Months[month]+" "+year);
		
		for(int i=0;i<7;i++)
			System.out.print(day[i]+" ");
		System.out.print("\n");
	
		int count=0;
		
		CalenderStackNode dateNode=new CalenderStackNode();
		
		
		System.out.print(dateNode.date+"   ");;
		for(int i=1;i<=(totalDayInMonth[month]+d);i++)
		{
//			if(CalenderStackLinkedList.top!=null)
//				dateNode=CalenderStackLinkedList.pop();
//			else
//				break;
//			if(i<10)
//				System.out.print(dateNode.date+"   ");
//			else
//				System.out.print(dateNode.date+"  ");
//			count++;
//			if(count%7==0)
//				System.out.print("\n");
			dateNode=CalenderStackLinkedList.pop(CalenderStackLinkedList.top);
			CalenderStackLinkedList.push(dateNode);
		}
		
		for(int i=1;i<=(totalDayInMonth[month]+d);i++)
		{
			if(CalenderStackLinkedList.top!=null)
				dateNode=CalenderStackLinkedList.pop(CalenderStackLinkedList.topSecondStack);
			else
				break;
			if(i<10)
				System.out.print(dateNode.date+"   ");
			else
				System.out.print(dateNode.date+"  ");
			count++;
			if(count%7==0)
				System.out.print("\n");
//			dateNode=CalenderStackLinkedList.pop();
//			CalenderStackLinkedList.push(dateNode);
		}
		dateNode=CalenderStackLinkedList.pop(CalenderStackLinkedList.topSecondStack);
		while(dateNode.date==0)
		{
			if(CalenderStackLinkedList.top!=null)
			{
				
				dateNode=CalenderStackLinkedList.pop(CalenderStackLinkedList.topSecondStack);
				if(dateNode.date==0)
					System.out.print(dateNode.date+"   ");
//				System.out.print("    ");
				count++;
			}
		}
	}
		
}
