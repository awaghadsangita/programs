package com.bridgelabz.DataStructure;

public class Util {
	public static int factorial(int number)
	{
		int fact=1;
		for(int i=1;i<=number;i++)
			fact=fact*i;
		
		return fact;
	}
	public static int findNumberPossibleBinaryTree(int Node)
	{
		int num= factorial(2*Node);
		int	deno=factorial(Node+1)*factorial(Node);
		int numberOfPossibility=num/deno;
		return numberOfPossibility;
		
	}
}
