package com.bridgelabz.DataStructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.io.Writer;

public class LinkedListRunner_1 {
	public static void main(String args[])
	{
		try {
			
			Scanner sc=new Scanner(System.in);
			LinkedList list=new LinkedList();
				
			FileReader fr=new FileReader("/home/user/Desktop/sangita.txt"); 
			BufferedReader br=new BufferedReader(fr);   
			
		    String line;
		    String[] data = {};
//		    List<String> wordList = new ArrayList<String>();
		    
		    while((line = br.readLine()) != null){
		    	data= line.split(" ");
		    	for(int i=0; i <data.length; i++)
		    	{
		    		list.append(data[i]);
		    		
		    	}
		    }
		
		    String searchString="";
		    System.out.println("Data in Linked List");
	    	list.show();
		    do 
		    {
		    	
		    	System.out.println("Enter word to Search or if you want to exit press 0");
		    	searchString=sc.next();
		    	if(searchString.compareTo("0")!=0)
		    	{
		    		boolean result=list.Search(searchString);
		    		if(result)
		    		{
		    			System.out.println(searchString+" is FOUND in List");
		    			int pos=list.index(searchString);
		    			String removedItem=list.Pop(pos);
		    			System.out.println("Item "+removedItem+" is removed from List\nList After Removed item");
		    			FileWriter wr= new FileWriter("/home/user/Desktop/sangita.txt",false);
		    			Node temp=list.head;
		    			while(temp!=null)
		    			{
		    				wr.write(temp.data);
		    				wr.flush();
		    				wr.write(" ");
		    				wr.flush();
		    				temp=temp.next;
		    			}
		    		}
		    		else
		    		{
		    			System.out.println(searchString+" is NOT found in List");
		    			list.append(searchString);
		    			
		    			FileWriter wr= new FileWriter("/home/user/Desktop/sangita.txt",false);
		    			Node temp=list.head;
		    			while(temp!=null)
		    			{
		    				wr.write(temp.data);
		    				wr.flush();
		    				wr.write("");
		    				wr.flush();
		    				temp=temp.next;
		    			}
		    			
		    		}
		    	}
		    }while(searchString.compareTo("0")!=0);
		    list.insert(1, "abx");
		    list.show();
		}
		catch(IOException e)
		{
			
		}
	
		
	}
}
