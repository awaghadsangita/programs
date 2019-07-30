package com.bridgelabz.algorithmprograms;
import java.util.Scanner;
public class BinaryMethod_16 extends Util {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int num =sc.nextInt();
		
		String binaryString=Util.toBinary(num);
		System.out.println("Binary Number of "+num+" is "+binaryString);
		
		
		while(binaryString.length()%4!=0)
		{
			binaryString='0'+binaryString;
		}
		char[] binaryChar=binaryString.toCharArray();
		int j=binaryChar.length-4;
			for(int i=0;i<4;i++)
			{
				char temp=binaryChar[i];
				binaryChar[i]=binaryChar[j];
				binaryChar[j]=temp;
				j++;
				
			} 
		String swapNibble=String.copyValueOf(binaryChar);
		System.out.println("Binary Number After Swapping Nibble : "+swapNibble);
		double decimal=Util.toDecimal(binaryChar);
		System.out.println("Decimal Number After Swapping Nibble : "+decimal);
	}
}
