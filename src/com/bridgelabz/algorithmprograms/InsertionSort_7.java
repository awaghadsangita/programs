package com.bridgelabz.algorithmprograms;
import java.util.*;
public class InsertionSort_7 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many word you want in list");
		int size=sc.nextInt();
		String[] arr=new String[size];
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter a["+(i+1)+"] Element: ");
			arr[i]=sc.nextLine();
		}
		System.out.println("List Before Sorting ");
		for(int i=0;i<size;i++)
		{
			System.out.print(" "+arr[i]);
		
		}
		
		for (int i=1; i<size; ++i)
        {
            String key = arr[i];
            int j = i-1;
            //a[1] is compare with a[0]
            //a[2] is compare with a[0] and a[1]
            while (j>=0 && arr[j].compareTo(key) >0)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        System.out.println("\nList After Sorting  ");
		for(int i=0;i<size;i++)
		{
			System.out.print(" "+arr[i]);
		
		}
	}
}
