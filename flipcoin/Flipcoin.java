package flipcoin;

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Flipcoin {
	public static void main(String args[])
	{
	
		Scanner in =new Scanner(System.in);
		System.out.println("How Many times you want to flip");
		int numberoftimes=in.nextInt();
		int i=1;
		Random rand = new Random(); 
		double result;
		int headcount=0;
		int tailcount=0;
		float headpercentage=0.0f;
		float tailpercentage=0.0f;
		if(numberoftimes>0)
		{
			while(i<=numberoftimes)
			{
				result=Math.random();  
			
				if(result<0.5)
				{
					System.out.println("You Flip Tail");
					tailcount++;
				}
				else
				{
					System.out.println("You Flip Head");
					headcount++;
				}
				i++;
			}
		}
		else 
		{
			System.out.println("Number of Filps Must be Positive Number");
		}
		System.out.println("Number of times Head Filps :"+headcount);
		System.out.println("Number of times Tail Filps :"+tailcount);
		
		headpercentage=(float)((float)headcount/numberoftimes*100.0);
		System.out.println("Head Percentage is "+headpercentage);
		
		tailpercentage=(float) (100.0-headpercentage);
		System.out.println("Tail Percentage is "+tailpercentage);
		
	}

}
