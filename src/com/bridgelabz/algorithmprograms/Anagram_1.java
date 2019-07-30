package com.bridgelabz.algorithmprograms;
import java.util.Scanner;
public class Anagram_1 extends Util{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First String ");
		String firstStr= sc.nextLine();
		char[] charArr1=firstStr.toCharArray();

		System.out.print("Enter Second String to check whether it is anagram of first string ");
		String secondStr= sc.nextLine();
		char[] charArr2=secondStr.toCharArray();
		
//		boolean isAnangram= CheckAnagram(charArr1,charArr2);
		boolean isAnangram= Util.CheckAnagram(firstStr,secondStr);
		if(isAnangram)
			System.out.println("\nString '"+firstStr+"' And String '"+secondStr+"' are Anangram of each other");
		else
			System.out.println("String '"+firstStr+"' And String '"+secondStr+"' are NOT Anangram of each other");
	}
	
}
