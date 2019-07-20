package AlgorithmPrograms;
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
            
            /* Move elements of arr[0..i-1], that are
            greater than key, to one position ahead
            of their current position */
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
