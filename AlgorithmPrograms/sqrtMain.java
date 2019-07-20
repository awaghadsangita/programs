package AlgorithmPrograms;
import java.util.Scanner;
public class sqrtMain extends Util {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Nonnegative Number :");
		double num=sc.nextDouble();
		
		System.out.println("SquareRoot of "+num+" is :"+Util.sqrt(num));
		
	}
}
