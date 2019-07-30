package com.bridgelabz.algorithmprograms;
import java.util.*;
public class QuestionToFindYourNumber {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int limit=Integer.parseInt(args[0]);
		int mid;
		String answer=new String();
		answer="no";
		String replyNo=new String();
		replyNo="no";
		String replyYes=new String();
		replyYes="yes";
		int l=0,r=limit;
		do
		{
			mid=(l+r)/2;
			System.out.println("your guess number is:"+mid);
			answer=sc.nextLine();
			System.out.println(" "+answer);
			
			if(answer.compareTo(replyNo)==0)
			{
				System.out.println("Is your Guess Number Greater than "+mid);
				String isGraterThan=sc.nextLine();
				
				if(isGraterThan.compareTo(replyYes)==0)
				{
					l=mid+1;
				}
				else
				{
					r=mid-1;
				}
			}
			
			
		}while(answer.compareTo(replyYes)!=0);
	}

}
