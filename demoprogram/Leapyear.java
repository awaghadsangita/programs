package demoprogram;
import java.util.*; ;

public class Leapyear {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Year");
		int year=in.nextInt();
		boolean result=leapyearChecker(year);;
		
		if(result)
			System.out.println("Year"+year+" is Leap Year");
		else
			System.out.println("Year"+year+" is not Leap Year");
	 
	}
	public static boolean leapyearChecker(int year)
	{
		if(year>=1000)
		{
			if(year%4==0)
			{
				return true;
			}
		}
		else
		{
			System.out.println("Enter Four Digit Year");
			
		}
		return false;
	}
}
