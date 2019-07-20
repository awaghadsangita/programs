import java.util.*;
import java.lang.Math.*;

public class quadratic_15 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of a,b and c (ax^2+bx+c) :");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		findRoots(a,b,c);
	}
	public static void findRoots(int a,int b,int c)
	{
		double root1;
		double root2;
		if(a==0)
		{
			System.out.println("Invalid values");
			return;
		}
		int delta=b*b-4*a*c;
		double sqrt_val=Math.sqrt(Math.abs(delta));
		
		System.out.println(sqrt_val);
		if(delta>0)
		{
			System.out.println("Roots are Real and Different\n");
			root1=(-b + Math.sqrt(delta))/(2*a);
			root2=(-b - Math.sqrt(delta))/(2*a);
			System.out.println("First Root of x:"+root1+"\nSecond Root of x:"+root2);
		}
		else if(delta<0)
		{
			System.out.println("Roots are Complex\n");
			System.out.println("First Root of x:("+-b+"+"+sqrt_val+"i)"+"/"+(2*a)+"\nSecond Root of x("+-b+"-"+sqrt_val+"i)"+"/"+(2*a));
		}
		else
		{
			System.out.println("Roots are Real and Same\n");
			root1=(b + Math.sqrt(delta))/(2*a);
			root2=(-b - Math.sqrt(delta))/(2*a);
			System.out.println("First Root of x: "+root1+"\nSecond Root of x: "+root2);
		}
	}
}
