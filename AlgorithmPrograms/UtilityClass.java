package AlgorithmPrograms;
import java.util.*;
public class UtilityClass {
	//bubbleSort method for integer
	public static void bubbleSort(int[] arr,int arrSize)
	{
		System.out.println("Array Before Bubble Sorting");
		for(int i=0;i<arrSize;i++)
			System.out.print(" "+arr[i]);
		
		for(int i=0;i<arrSize;i++)
		{
			for(int j=0;j<arrSize-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("\nArray After Bubble Sorting");
		for(int i=0;i<arrSize;i++)
			System.out.print(" "+arr[i]);
	}
	//bubbleSort method for string
	public static void bubbleSort(String[] arr,int arrSize)
	{
		String temp=new String();
		
		System.out.println("String Array Before Bubble Sorting");
		for(int i=0;i<arrSize;i++)
			System.out.print(" "+arr[i]);
		
		for(int i=0;i<arrSize-1;i++)
		{
			for(int j=0;j<arrSize-i-1;j++)
			{
				if(arr[j].compareTo(arr[j+1])>0)
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("\nString Array After Bubble Sorting");
		for(int i=0;i<arrSize;i++)
			System.out.print(" "+arr[i]);
	}
	//Insertion Sort Method for Integer
	public static void insertionSort(int[] arr,int intArrSize)
	{
		int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 

		System.out.println("\nString Array After Insertion Sorting");
		for(int i=0;i<intArrSize;i++)
			System.out.print(" "+arr[i]);
	}
	//Insertion Sort Method for String
	public static void insertionSort(String[] arr,int ArrSize)
	{
		int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            String key = arr[i]; 
            int j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && arr[j].compareTo(key)>0){ 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
        System.out.println("\nString Array After Insertion Sorting");
		for(int i=0;i<ArrSize;i++)
			System.out.print(" "+arr[i]);
	}
	//Binary Search Method for Integer
	
	public static int binarySearch(int arr[], int l, int r, int x) 
	{ 
	    while (l <= r) { 
	        int m = l + (r - l) / 2; 
	  
	        // Check if x is present at mid 
	        if (arr[m] == x) 
	            return m; 
	  
	        // If x greater, ignore left half 
	        if (arr[m] < x) 
	            l = m + 1; 
	  
	        // If x is smaller, ignore right half 
	        else
	            r = m - 1; 
	    } 
	  
	    // if we reach here, then element was 
	    // not present 
	    return -1; 
	} 
	//Binary Search Method for String
	static int binarySearch(String[] arr, String x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            int res = x.compareTo(arr[m]); 
  
            // Check if x is present at mid 
            if (res == 0) 
                return m; 
  
            // If x greater, ignore left half 
            if (res > 0) 
                l = m + 1; 
  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
  
        return -1; 
    } 
}








