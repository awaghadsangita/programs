import java.util.Scanner;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer; 
public class twoDArray_9     {
	public static void main(String[] args)
	{
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Rows you want in array");
		int row=sc.nextInt();
		System.out.println("How many Column you want in array");
		int col=sc.nextInt();
		int [][] intArr= new int[row][col];
		double [][] doubleArr= new double[row][col];
		boolean [][] booleanArr= new boolean[row][col];
		
		for(int r=0;r<row;r++)
		{
			for(int c=0;c<row;c++)
			{
				System.out.println("Enter integer (intArr["+r+"][" +c+ "]value:");
				intArr[r][c]=sc.nextInt();
			}
		}
		for(int r=0;r<row;r++)
		{
			for(int c=0;c<row;c++)
			{
				System.out.println("Enter Double (doubleArr["+r+"][" +c+ "]value:");
				doubleArr[r][c]=sc.nextDouble();
			}
		}
		for(int r=0;r<row;r++)
		{
			for(int c=0;c<row;c++)
			{
				System.out.println("Enter Boolean (booleanArr["+r+"][" +c+ "]value:");
				booleanArr[r][c]=sc.nextBoolean();
			}
		}
		PrintWriter pw=new PrintWriter(System.out,true);
		System.out.println("Your Interger 2D Array is:");
		for(int r=0;r<row;r++)
		{
			for(int c=0;c<row;c++)
			{
//				System.out.print("|"+intArr[r][c]);
				pw.print("|"+intArr[r][c]);  
			}
			pw.println("|");
		}
		System.out.println("\nYour Double 2D Array is:");
		for(int r=0;r<row;r++)
		{
			for(int c=0;c<row;c++)
			{
				System.out.print("|"+doubleArr[r][c]);
			}
			System.out.println("|");
		}
		System.out.println("\nYour Boolean 2D Array is:");
		for(int r=0;r<row;r++)
		{
			for(int c=0;c<row;c++)
			{
				System.out.print("|"+booleanArr[r][c]);
			}
			System.out.println("|");
		}
	
	}catch(Exception e)
	{
		System.out.println( e.getMessage());
	}
	}
}
