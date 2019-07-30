package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class UtilityClassMain extends UtilityClass {
	public static void main(String args[])
	{
		long start[]=new long[6];
		long stop[]=new long[6];
		long elapseTime[]=new long[6];
		String[] method=new String[6];
	     method[0]="Integer Bubble Sort";
		 method[1]="String Bubble Sort";
		 method[2]="Integer Insertion Sort";
		 method[3]="String Insertion Sort";
		 method[4]="Integer Binary Search";
		 method[5]="String Binary Sort";
//		long bubbleIntegerStart,bubbleIntgerStop,bubbleIntegerElapse;
//		long bubbleStringStart,bubbleStringStop,bubbleStringElapse;
//		
//		long insertionIntegerStart,insertionIntgerStop,insertionIntegerElapse;
//		long insertionStringStart,insertionStringStop,insertionStringElapse;
//		
//		long binarySearchIntegerStart,binarySearchIntgerStop,binarySearchIntegerElapse;
//		long binarySearchStringStart,binarySearchStringStop,binarySearchStringElapse;
		
		
		
		Scanner sc =new Scanner(System.in);
		int intArrSize;
		System.out.println("\n\n**Sort Array Element using Bubble Sort**");
		System.out.println("How many Element You Want in Array");
		intArrSize=sc.nextInt();
		int arr[]=new int[intArrSize];
		start[0]=System.currentTimeMillis();
		for(int i=0;i<intArrSize;i++)
		{
			System.out.print("Enter a["+i+"] :");
			arr[i]=sc.nextInt();
		}
		
		UtilityClass.bubbleSort(arr,intArrSize);
		stop[0]=System.currentTimeMillis();
		System.out.println("\nElapse Time for "+method[0]+" is :"+(stop[0]-start[0]));
		
		
		System.out.println("\n\n**Sort String array using bubble Sort**");
		System.out.println("How many Element You Want in String Array");
		intArrSize=sc.nextInt();
		String arrStr[]=new String[intArrSize];
		start[1]=System.currentTimeMillis();
		for(int i=0;i<intArrSize;i++)
		{
			System.out.print("Enter a["+i+"]");
			arrStr[i]=sc.next();
		}
		
		UtilityClass.bubbleSort(arrStr,intArrSize);
		stop[1]=System.currentTimeMillis();
		System.out.println("\nElapse Time for "+method[1]+" is :"+(stop[1]-start[1]));
		
		
		
		System.out.println("\n\n**Sorting Integer Array Using Insertion Sort**");
		System.out.println("How many Element You Want in Array for Insertion Sort");
		intArrSize=sc.nextInt();
		int arrInsertion[]=new int[intArrSize];
		start[2]=System.currentTimeMillis();
		for(int i=0;i<intArrSize;i++)
		{
			System.out.print("Enter a["+i+"] :");
			arrInsertion[i]=sc.nextInt();
		}
		
		UtilityClass.insertionSort(arrInsertion,intArrSize);
		stop[2]=System.currentTimeMillis();
		System.out.println("\nElapse Time for "+method[2]+" is :"+(stop[2]-start[2]));
		
		System.out.println("\n\n**Sort String Array using Insertion Sort**");
		System.out.println("How many Element You Want in String Array");
		intArrSize=sc.nextInt();
		String arrStr1[]=new String[intArrSize];
		start[3]=System.currentTimeMillis();
		for(int i=0;i<intArrSize;i++)
		{
			System.out.print("Enter a["+i+"] :");
			arrStr1[i]=sc.next();
		}
		
		UtilityClass.insertionSort(arrStr1,intArrSize);
		stop[3]=System.currentTimeMillis();
		System.out.println("\nElapse Time for "+method[3]+" is :"+(stop[3]-start[3]));
		
		System.out.println("\n\n**Search Integer Element using Binary Search**");
		System.out.println("How many Element You Want in Array for Binary Search");
		int ArrSize=sc.nextInt();
		int arrBinary[]=new int[ArrSize];
		start[4]=System.currentTimeMillis();
		for(int i=0;i<ArrSize;i++)
		{
			System.out.print("Enter a["+i+"] :");
			arrBinary[i]=sc.nextInt();
		}
		for(int i=0;i<ArrSize-1;i++)
		{
			for(int j=0;j<ArrSize-i-1;j++)
			{
				if(arrBinary[j]>arrBinary[j+1])
				{
					int temp=arrBinary[j];
					arrBinary[j]=arrBinary[j+1];
					arrBinary[j+1]=temp;
				}
			}
		}
		System.out.println("Enter Element To Search");
		int x=sc.nextInt();
		
		int result=UtilityClass.binarySearch(arrBinary,0,ArrSize-1,x);
		
		if(result==-1)
			System.out.println(x+" NOT Present in array ");
		else
			System.out.println(x+" Present in array ");
		stop[4]=System.currentTimeMillis();
		System.out.println("\nElapse Time for "+method[4]+" is :"+(stop[4]-start[4]));

		System.out.println("\n\n**Search String Element using Binary Search**");
		System.out.println("How many Element You Want in String Array");
		int strArrSize=sc.nextInt();
		String arrStr2[]=new String[strArrSize];
		start[5]=System.currentTimeMillis();
		for(int i=0;i<strArrSize;i++)
		{
			System.out.print("Enter a["+i+"] :");
			arrStr2[i]=sc.next();
		}
		String temp=new String();
		
		for(int i=0;i<strArrSize-1;i++)
		{
			for(int j=0;j<strArrSize-i-1;j++)
			{
				if(arrStr2[j].compareTo(arrStr2[j+1])>0)
				{
					temp=arrStr2[j];
					arrStr2[j]=arrStr2[j+1];
					arrStr2[j+1]=temp;
				}
			}
		}
		System.out.println("Enter Element To Search");
		String x1=sc.nextLine();
		
//		int result1=UtilityClass_4.BinarySearchString(arrStr2,x1,0,strArrSize-1);
		int result1=UtilityClass.binarySearch(arrStr2,x1);
		
		
		
		if(result1==-1)
			System.out.println(x1+" NOT Present in array ");
		else
			System.out.println(x1+" Present in array ");
		stop[5]=System.currentTimeMillis();
		System.out.println("\nElapse Time for "+method[5]+" is :"+(stop[5]-start[5]));
		for(int i=0;i<6;i++)
		{
			elapseTime[i]=stop[i]-start[i];
//			01-Integer Bubble Sort
//			02-String Bubble Sort
//			03-Integer Insertion Sort
//			04-String Insertion Sort
//			05-Integer Binary Search
//			06-String Binary Sort
		}
		

			for(int k=0;k<6;k++)
			{
				System.out.println("Elapse Time for "+method[k]+" is :"+elapseTime[k]);
			}
			
		 System.out.println("\n");
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6-i;j++)
			{
				if(elapseTime[j]>elapseTime[j+1])
				{
					long t=elapseTime[j];
					elapseTime[j]=elapseTime[j+1];
					elapseTime[j+1]=t;
					
					String m=method[j];
					method[j]=method[j+1];
					method[j+1]=m;
				}
				
			}
			
		}	
		for(int i=0;i<6;i++)
		{
			System.out.println("Elapse Time for"+method[i]+" is :"+elapseTime[i]);
		}
	}
}






















