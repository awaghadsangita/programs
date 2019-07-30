package com.bridgelabz.functional;
import java.util.Scanner;
public class Hellousername_1 {

	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter User Name");
		String username=in.nextLine();
		
		String str="Hello Username,How are you!!";
		if(username.length()>3)//check length of username is greater or not 
		{
			System.out.println(str.replaceAll("Username", username));
		}
		else {
			System.out.println("Username must be atleast 3 characters");
		}
	}
	
}
