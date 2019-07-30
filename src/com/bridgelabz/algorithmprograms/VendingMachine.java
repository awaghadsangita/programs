package com.bridgelabz.algorithmprograms;
import java.util.*;
public class VendingMachine {
	static int total=0,i=0;
	static int[] note= new int[]{1000,500,100,50,10,5,2,1}; 
	public static void main(String args[])
	{	
//		try 
//		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Rupees for change :");
			int rs=sc.nextInt();
			VendingMechine(rs);
//		}catch(Exception e)
//		{
//			System.out.println("Enter Rupees in Integer");
//		}
	}
	
	public static void VendingMechine(int rs)
	{
		if(rs/note[i]!=0)
		{
			total=total+rs/note[i];
			System.out.println(note[i]+"/-Rs Notes :"+rs/note[i]);
			rs=rs%note[i];
		}
		i++;
		if(rs==0)
			System.out.println("Total Notes: "+total);
		else
			VendingMechine(rs);
			
	}
}
