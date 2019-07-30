package com.bridgelabz.DataStructure;
import java.io.*;
import java.util.Scanner;
public class HashingFunctiontoSearchNuminslot {

	public static void main(String args[])
	{
		try {
			HashLinkedList list=new HashLinkedList();
			FileReader fr=new FileReader("/home/user/Desktop/sangita.txt");
			Scanner sc=new Scanner(fr);
			Scanner sc1=new Scanner(System.in);
			int data;
			while(sc.hasNext())
			{
				data=sc.nextInt();
				list.insert(data);
			}
			int search;
			do
			{
				System.out.println("Link list item");
				list.show();
				System.out.println("\nEnter number to Search or if you Want exit press 0");
				search=sc1.nextInt();
				if(search!=0)
				{
					int index=list.find(search);
					if(index!=-1)
					{
						System.out.println(search +" is FOUND in slot "+search%11+ " in "+index+ " node");
						list.delete(search);
					}
					else if(index==-1)
					{
						System.out.println(search +" is NOT FOUND in slot ");
						list.insert(search);	
					}
				}
				
			}while(search!=0);
			
			Writer wr= new FileWriter("/home/user/Desktop/sangita.txt",false);
						
			for(int i=0;i<list.head.length;i++)
			{
				HashNode temp=list.head[i];
				while(temp!=null)
				{
					wr.write(temp.data+" ");
					wr.flush();
					
					
					temp=temp.next;
				}
			}
		}
		
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
