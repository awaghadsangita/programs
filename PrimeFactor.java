import java.util.Scanner;
public class PrimeFactor {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		
		findPrimeFactor(n);
	}
	public static void findPrimeFactor(int n)
	{
		while(n%2==0)
		{
			System.out.print("2"+" ");
			n/=2;
		}
		for(int i=3;i<Math.sqrt(n);i+=2)
		{
			while(n%i==0)
			{
				System.out.print(i+" ");
				n=n/i;
			}	
		}
		if(n>2)
		{
			System.out.print(n);
		}
	}
}
