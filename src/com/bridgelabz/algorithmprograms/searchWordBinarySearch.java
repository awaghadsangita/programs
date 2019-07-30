package com.bridgelabz.algorithmprograms;
import java.io.*;
import java.util.*; 
public class searchWordBinarySearch {
	public static void main(String[] args)
	{
		try {
			File f = new File("/home/user/Desktop/sangita.txt");
			Scanner sc =new Scanner(System.in);
		
			String[] strArr=readFile(f);
			for(int i=0;i<strArr.length;i++)
			{
				System.out.print(" "+strArr[i]);
			}
			System.out.println("\nEnter the Name to Search");
			String name=sc.nextLine();
			int result=BinartSearch(strArr,name);
			if(result==-1)
				System.out.println(name+" is NOT present in List");
			else
				System.out.println(name+" is present in List");
		}catch(Exception e)
		{
			System.out.println("Exception");
		}
	}
	public static int BinartSearch(String[] arr,String x)
	{
		int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = (l + r) / 2; 
  
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
	public static String[] readFile(File f)throws IOException
	{
		String word = "";
		ArrayList<String> s1 = new ArrayList<String>();
		FileReader fr = new FileReader(f);
		int c;
		while ((c = fr.read()) != -1) {
			if (c == 44) {
				s1.add(word);
				word = "";
			} else {
				word = word + String.valueOf((char) c);
			}
		}
		fr.close();
		String[] s = new String[s1.size()];
		s1.toArray(s);
		return s;
	}
}
