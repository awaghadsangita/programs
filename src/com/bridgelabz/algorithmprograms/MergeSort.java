package com.bridgelabz.algorithmprograms;
import java.util.*;
public class MergeSort extends Util {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Element you want in List");
		int size=sc.nextInt();
		String[] arr=new String[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter a["+(i+1)+"] Element ");
			arr[i]=sc.next();
		}
		System.out.println("\nList before Sorting: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		Util.sort(arr,0,size-1);
		System.out.println("\nList after Sorting: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	
}
