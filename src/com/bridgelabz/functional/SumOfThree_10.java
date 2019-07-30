package com.bridgelabz.functional;
import java.util.Scanner;

public class SumOfThree_10 {
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Elemeny you want in array");
		n=sc.nextInt();
		
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		findTriplet(arr);
	}
	static void findTriplet(int[]arr)
	{
		int first,second,third=0;
		for(first=0;first<arr.length-2;first++)
		{
			for(second=first+1;first<arr.length-1;first++)
			{
				for(third=second+1;second<arr.length;second++)
				{
					if(arr[first]+arr[second]+arr[third]==0)
					{
						System.out.println(arr[first]+" + "+arr[second]+" + "+arr[third]+" = 0");
					}
				}
			}
		}
	}
}
