package com.bridgelabz.DataStructure;

public class Prime_12 {

	public static void main(String args[])
	{

		int prime[]=new int[500];
		int anagram[][]=new int[2][500];
		int start=0,stop=1000,Primecount=0,AnagramCount=0,mNotAnagramCount=0;
					
			 int returnPrime[]=PrimeUtility.findPrime(start, stop);
			 for(int k=0;k<returnPrime.length;k++)
			 {
				 if(returnPrime[k]>0)
				 {
					 prime[k]=returnPrime[k];
					 Primecount++;
				 }
			}			 
			int returnAngram[][]=PrimeUtility.findAnagram(returnPrime);

			for(int k=0;returnAngram[0][k]!=0;k++)
			{
				 	anagram[0][k]=returnAngram[0][k];
//				 	System.out.println(anagram[0][k]+" ");
					 AnagramCount++;
			}
			for(int k=0;returnAngram[1][k]!=0;k++)
			{
				 	anagram[1][k]=returnAngram[1][k];
					 mNotAnagramCount++;
			}
		
		System.out.println("Anagram Number are as follows");
		for(int k=0;anagram[0][k]!=0;k+=2)
		{
			System.out.print(anagram[0][k]+" And "+anagram[0][k+1]+ " Are Anagram\n");
		}
		
		
		System.out.print("Total Not Anagram: "+AnagramCount);
		System.out.println("\n\nPrime Number that are not Anagram as follows");
		for(int k=0;anagram[1][k]!=0;k++)
		{
			System.out.print(anagram[1][k]+" ");
		}
		System.out.print("\nTotal Anagram: "+mNotAnagramCount);
		System.out.println("\n\nAnagram Numbers in Stack are as follows");
		for(int k=0;anagram[0][k]!=0;k+=2)
		{
			AnagramStackList.push(anagram[0][k], anagram[0][k+1]);
		}
		
//		AnagramList.show();
		AnagramStackList.TOP=AnagramStackList.HEAD;
		AnagramNode temp=AnagramStackList.pop();
		
		while(AnagramStackList.TOP!=null)
		{
			
			System.out.print(temp.FirstNumber+" And "+temp.SecondNumber+ " Are Anagram\n");
			temp=AnagramStackList.pop();
		}
		
		System.out.println("\n\nAnagram Numbers in Queue are as follows");
		for(int k=0;anagram[0][k]!=0;k+=2)
		{
			AnagramList.add(anagram[0][k], anagram[0][k+1]);
		}
		
//		AnagramList.show();
		AnagramList.FRONT=AnagramList.HEAD;
		temp=AnagramList.remove();
		
		while(AnagramList.FRONT!=null)
		{
			
			System.out.print(temp.FirstNumber+" And "+temp.SecondNumber+ " Are Anagram\n");
			temp=AnagramList.remove();
		}
		
	}
}
