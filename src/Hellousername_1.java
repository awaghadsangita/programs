import java.util.Scanner;
public class Hellousername_1 {

	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter User Name");
		String username=in.nextLine();
		
		if(username.length()>3)//check length of username is greater or not 
		{
			System.out.println("Hello "+username);
		}
		else {
			System.out.println("Username must be atleast 3 characters");
		}
	}
	
}
