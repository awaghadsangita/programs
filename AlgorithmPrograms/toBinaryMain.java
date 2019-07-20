package AlgorithmPrograms;
import java.util.Scanner;
public class toBinaryMain extends Util {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number ");
		int num =sc.nextInt();
		System.out.println("Binary number of "+num+" is :"+Util.toBinary(num));
	}

}
