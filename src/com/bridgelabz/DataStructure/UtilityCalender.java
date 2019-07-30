package com.bridgelabz.DataStructure;

public class UtilityCalender {
	public static int dayOfWeek(int d,int m,int y)
	{
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		return d0;
		
	}
	public static boolean isLeapYear(int year)
	{
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
					return false;
				else
					return true;
			}
			else
				return false;
		}
		else
			return true;
	}
	
}
