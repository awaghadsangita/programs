  package com.bridgelabz.functional;
import java.util.*;
public class permutation {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		int totalPermuation=1;
		for(int i=1;i<=s.length();i++)
			totalPermuation=totalPermuation*i;
		Permute(s,0,s.length()-1,totalPermuation);
		
	}
	static int count=0;
	static ArrayList<String> permutaion=new ArrayList<String>();
	public static void Permute(String s,int l,int r,int totalPermuation)
	{
		
		if(l==r)
		{
			permutaion.add(s);
			
//			System.out.print(s+" ");
			count++;
			if(count==totalPermuation)
			{
				String[] arr=new String[permutaion.size()];
				permutaion.toArray(arr);
				int i,j,k=0;
				for(i=0;i<count;i++)
				{
					for(j=0;j<i;j++)
					{
						if(arr[j].compareTo(arr[i])==0)
							break;
					}
					if(i==j)
					{
						arr[k]=arr[i];
						k++;
					}	
				}
				System.out.print("\n ");
				for(int itr=0;itr<k;itr++)
					System.out.print(arr[itr]+" ");
			}
		}
		else
		{
			for(int i=l;i<=r;i++)
			{	
				s=swap(s,l,i);
				Permute(s,l+1,r,totalPermuation);
				s=swap(s,l,i);
			}
		}
		
		
	}
	public static String swap(String s,int l,int i)
	{
		char[] charArray=s.toCharArray();
		char temp=charArray[l];
		charArray[l]=charArray[i];
		charArray[i]=temp;
		
		return String.valueOf(charArray);
	}
	
}
