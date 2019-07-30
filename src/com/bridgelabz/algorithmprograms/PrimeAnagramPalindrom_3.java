package com.bridgelabz.algorithmprograms;

import java.util.*;
public class PrimeAnagramPalindrom_3 extends Util {
	public static void main(String[] args)
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Range1 ");
//		int start=sc.nextInt();
//		int stop=sc.nextInt();
		int i,count=0;
		boolean isPrime=false;
		int primeArr[]=new int[500];

		primeArr=Util.findPrime(0, 1000);
		System.out.println("Prime Number in Range 0-1000");
		for(i=0;i<primeArr.length;i++)
		{
			if(primeArr[i]>0)
			{
				System.out.print(primeArr[i]+", ");
				count++;
			}
		}
		System.out.println("\nTotal Prime Numbers :"+count);
		count=0;
		
		int[] anagramArr=Util.isAnangram(primeArr);
		System.out.println("\nPrime Number in Range 0-1000 that are Anagram");
		for(i=0;i<anagramArr.length;i++)
		{
			if(anagramArr[i]>0)
			{
				System.out.print(anagramArr[i]+", ");
				count++;
			}
		}
		System.out.println("\nTotal Anagram Numbers :"+count);
		
		Util.isPalindrome(anagramArr);
	}
	
	
	
}
