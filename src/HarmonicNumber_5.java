import java.util.Scanner;
public class HarmonicNumber_5 {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		float harmonicnumber=0;
		int i=0;
		if(n>0)
		{
			for(i=1;i<=n;i++)
			{
				harmonicnumber+=(float)1/i;
			}
			System.out.println("Harmonic value for Number is "+harmonicnumber);
		}
		else
		{
			System.out.println("Number must be greater than Zero");
		}
		
	}
}
