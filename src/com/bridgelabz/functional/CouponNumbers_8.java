package com.bridgelabz.functional;
import java.util.Random;
import java.util.Scanner;
public class CouponNumbers_8 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Coupan You Want");
		int no=sc.nextInt();
		Random rand=new Random();
		int[] coupan=new int[no];
		int count=0;
		int i=0;
		for(i=0;i<no;i++)
		{
			int randomNumber=rand.nextInt(no);
			int k=0;
			for(int j=0;j<i;j++)
			{
				if(coupan[j]==randomNumber)
				{
					break;
				}
				k++;
			}
			if(i==k)
			{
				coupan[i]=randomNumber;
				count++;
			}
			i=count;
		}
		System.out.println("Generated Coupans are as follows");
		
		for(i=0;i<no;i++)
		{
			System.out.println((i+1)+" Coupan Number is : "+coupan[i] );
		}
		System.out.println("Total number of Coupans: "+count);
	}
}
