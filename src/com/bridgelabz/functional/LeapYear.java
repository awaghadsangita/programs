package com.bridgelabz.functional;
import java.util.Scanner;

public class LeapYear {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Year");
		int year=in.nextInt();
		int result=leapyearChecker(year);;
		
		if(result==1)
			System.out.println("Year "+year+" is Leap Year");
		else if(result==0)
			System.out.println("Year "+year+" is not Leap Year");
	 
	}
	public static int leapyearChecker(int year)
	{
		if(year>=1000 && year<=9999)
		{
			if(year%4==0)
			{
				if( year % 100 == 0)
	            {
	                // year is divisible by 400, hence the year is a leap year
	                if ( year % 400 == 0)
	                    return 1;
	                else
	                    return 0;
	            }
	            else
	                return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			System.out.println("Enter Four Digit Year");
			return -1;
		}
		
	}
}
