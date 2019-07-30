package com.bridgelabz.DataStructure;
import java.util.*;
public class Stack {
	public static final int MAX=1000;
	static int top;
	static char stk[]=new char[MAX];
	
	Stack()
	{
		top=-1;
	}
	public static boolean isEmpty()
	{
		if(top<0)
			return true;
		else
			return false;
	}
	public static void push(char parenthesis)
	{
		stk[++top]=parenthesis;
		
	}
	public static char pop()
	{
		if(isEmpty())
		{
			return '1';
		}
		else
		{
			char parenthesis=stk[top];
			top--;
			return parenthesis;
		}
	}
	public static char peek()
	{
		char parenthesis=stk[top];
		return parenthesis;
	}
	public static void main(String args[])
	{
		Stack s=new Stack();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Arithmetic Expression");
		String expression=sc.next();
		
		char[] expressionArray=expression.toCharArray();
		boolean hasSameClosing=true;
		for(int i=0;i<expressionArray.length;i++)
		{
			char chr=expressionArray[i];
			if(chr=='('||chr=='['||chr=='{')
			{
				push(chr);
//						
			}
			else if(chr==')'||chr==']'||chr=='}')
			{
				char returnChar=pop();
				if(chr==')' && returnChar!='('||chr==']' && returnChar!='['||chr=='}' && returnChar!='{')
					hasSameClosing=false;
			}
		}
		if(top==-1 && hasSameClosing)
			System.out.println(expression+" has Balanced Parenthesis");
		else
		{
			System.out.println(expression+" has NOT Balanced Parenthesis");
		}
	}
}
