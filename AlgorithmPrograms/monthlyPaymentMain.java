package AlgorithmPrograms;
import java.util.Scanner;
public class monthlyPaymentMain extends Util {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		double p = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		double r = Double.parseDouble(args[2]);
		
		double payment=Util.monthlyPayment(p, y, r);
		System.out.println("Monthly Payment is :"+payment);
	}
}
