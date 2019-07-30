package com.bridgelabz.algorithmprograms;
import java.util.Scanner;
public class sqrtMain extends Util {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Nonnegative Number :");
		double num=sc.nextDouble();
		if(num>0)
		System.out.println("SquareRoot of "+num+" is :"+Util.sqrt(num));
		else
			System.out.println("Enter Non Negative Number");
		
	}
}
