package com.bridgelabz.algorithmprograms;
import java.util.*;
public class BubbleSort_8 {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("How many element you want in List");
		int size=sc.nextInt();
		int[]arr=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter a["+(i+1)+"] Integer Element:");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("List Before Sorting");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		for (int i = 0; i < size - 1; i++)  
        { 
     
            for (int j = 0; j < size - i - 1; j++)  
            { 
                if (arr[j] > arr[j + 1]) // a[0] is greater than a[1] then 
                	//swap after swapping a[1] contain larger element a[1] is compare with
                	//a[2]
                { 
                    int temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                } 
            } 
        }

		System.out.println("\nList After Sorting");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}
