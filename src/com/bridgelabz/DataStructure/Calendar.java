package com.bridgelabz.DataStructure;

public class Calendar {
	public static void main(String args[])
	{
		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		int date2DArray[][]=new int[2][35];
		String day[]= {"SUN","MON","THU","WEN","TUR","FRI","SAT"};
		int d=UtilityCalender.dayOfWeek(1,month,year);
		
		int totalDayInMonth[]= {0,31,28,31,30,31,30,31,30,30,31,30,31};
		String Months[]= {"","January","February","March","April","May","June","July","August","September","October","November","December"};
		
		if(UtilityCalender.isLeapYear(year))
			totalDayInMonth[2]=29;
		
		
		System.out.println("   "+Months[month]+" "+year);
		for(int i=0;i<7;i++)
			System.out.print(day[i]+" ");
		System.out.print("\n");
		int count=0,days=0;
		while(count<d )
		{
			date2DArray[0][count]=0;
			date2DArray[1][count]=days;

			count++;
			days++;
		}
		for(int i=1;i<=totalDayInMonth[month];i++)
		{
			date2DArray[0][count]=i;
			date2DArray[1][count]=days;
			count++;
			if(days%7==0)
			{
				days=0;
				System.out.print("\n");
			}
		}
		
		count=0;
		days=0;
		for(int i=1;i<=(d+totalDayInMonth[month]);i++)
		{
			
			if(date2DArray[0][count]==0)
				System.out.print("    ");
			else if(date2DArray[0][count]<10)
				System.out.print(date2DArray[0][count]+"   ");
			else
				System.out.print(date2DArray[0][count]+"  ");
			count++;
			days++;
			if(days%7==0)
			{	
				days=0;
			  	System.out.print("\n");
			 }	
		}
		
	}

	
}
