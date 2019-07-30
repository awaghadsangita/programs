import java.util.Random;
import java.util.Scanner;
import java.lang.*;
public class FirstProject {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Coupan You Want");
		int no=sc.nextInt();
		int[] coupan=new int[no];
		Random rand=new Random();
		int i;
		for(i=0;i<no;i++)
		{
			int value=(int)rand.nextInt(5);
			int k=0;
			
			for(int j=0;j<i;j++)
			{
				if(coupan[j]==value)
				{
					break;
				}
				k++;
			}
			if(i==k)
			{
				coupan[i]=Math.abs(value);
			}
		}
		
		System.out.println("Coupon Numbers are");
		for(i=0;i<no;i++)
		{
			System.out.println(i+1+"Coupan Number: "+coupan[i]);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
