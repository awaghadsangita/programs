package com.bridgelabz.DataStructure;

public class Prime {
	public static void main(String args[])
	{
		int prime[][]=new int[10][200];
		int start=0,stop=100,count=0;
		for(int i=0;i<10;i++)
		{
			
			 int returnArray[]=PrimeUtility.findPrime(start, stop);
			 for(int k=0;k<returnArray.length;k++)
			 {
//				System.out.print(returnArray[k]+" ");
				prime[i][k]=returnArray[k];
				
			}
			 
			start=start+100;
			stop=stop+100;
		}
		start=0;stop=100;
		System.out.println("\nPrime Number are as follows");
		for(int i=0;i<10;i++)
		{
				System.out.print("Range "+ start+"-"+stop+"  :");
				for(int k=0;k<prime[i].length;k++)
				{
					if(prime[i][k]>0)
					{
						System.out.print(prime[i][k]+" ");
						count++;
					}
					
				}
				System.out.print("\n");
			start=start+100;
			stop=stop+100;
		}
	
		System.out.println("\nTotal "+count);
		
	}
}
