package com.bridgelabz.DataStructure;

import java.util.ArrayList;

public class PrimeUtility {
	public static int[]findPrime(int start,int stop)
	{
		
		ArrayList<Integer>prime=new ArrayList<Integer>();
		int count=0;
		int Prime[]=new int[200];
		for(int i=start;i<stop;i++)
		{
			if(i>=2)
			{
				boolean isPrime=true;
				for(int j=2;j<=i/2;j++)
				{
					if(i%j==0)
					{
						isPrime=false;
						break;
					}
				}
				if(isPrime)
				{
					prime.add(i);
					Prime[count++]=i;
				}
			}
		}

		return Prime;
	}
	public static int[][]findAnagram(int[]prime)
	{
		ArrayList<Integer>arr=new ArrayList<Integer>();
		int anagram[][]=new int[2][500];
		int count=0;
		for(int i=0;i<prime.length-1;i++)
		{
			if(prime[i]>0)
			{	
				for(int j=i+1;j<prime.length;j++)
				{
					int firstNum=prime[i];
					int secondNum=prime[j];
					int firstLength=0,secondLength=0;
					int[] firstCount=new int[10];
					int[] secondCount=new int[10];
				
					boolean isAnagram=true;
					for(int k=0;k<10;k++)
					{
						firstCount[k]=0;
						secondCount[k]=0;
					}
					while(firstNum>0)
					{
						int digit1=firstNum%10;
						firstCount[digit1]++;
						firstLength++;
						firstNum/=10;
					}
					while(secondNum>0)
					{
						int digit=secondNum%10;
						secondCount[digit]++;
						secondLength++;
						secondNum/=10;
					}
					if(firstLength==secondLength)
					{
						for(int itr=0;itr<10;itr++)
						{
							if(firstCount[itr]!=secondCount[itr])
							{
								isAnagram=false;
								break;
							}
						}
						if(isAnagram)
						{
//							System.out.println(prime[i]+" "+prime[j]);
							anagram[0][count]=prime[i];
							anagram[0][++count]=prime[j];
							count++;
						}
					}
				}
			}
		}
//		System.out.println(" "+count);
		count=0;
		for(int k=0;k<prime.length;k++)
		{
			boolean anagramPrime=false;
			for(int j=0;anagram[0][j]!=0;j++)
			{
				if(prime[k]==anagram[0][j])
				{
					anagramPrime=true;
					break;
				}
				
			}
			if(!anagramPrime)
				anagram[1][count++]=prime[k];
			
		}
		return anagram;
	}
}
