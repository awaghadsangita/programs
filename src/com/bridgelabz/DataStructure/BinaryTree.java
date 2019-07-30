package com.bridgelabz.DataStructure;

import java.util.Scanner;

public class BinaryTree {
	public static void main(String args[])
	{
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter Number of Nodes in binary tree");
		int node=scanner.nextInt();
		for(int i=1;i<=node;i++)
		{
			System.out.println("For node "+i+" number of possibilities are :"+Util.findNumberPossibleBinaryTree(i));
		}
	}
}
