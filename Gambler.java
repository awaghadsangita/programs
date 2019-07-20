import java.util.Scanner;

public class Gambler {
	public static void main(String[] args)
	{
		int stake,goal,numberOfTime;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter $stake Value :");
		stake=sc.nextInt();
		
		System.out.println("Enter $Goal Value :");
		goal=sc.nextInt();
		
		System.out.println("Enter Number of times you want to play:");
		numberOfTime=sc.nextInt();
		
		int wincount=0,bets=0;
		int cash=stake;
		
			for(int i=0;i<numberOfTime;i++)
			{
				bets++;
				if(Math.random()>0.5)
				{
					wincount++;
					cash++;
				}
				else
				{

					cash--;
				}
				if(cash==goal)
				{
					System.out.println();
					break;
				}
			}

		System.out.println("You Win match "+wincount+" Times");
		
		float winpercentage=(float)((float)wincount/bets*100);
		System.out.println("Percentage of match win" +winpercentage);
		
		float loospercentage=(float)(100-winpercentage);
		System.out.println("Percentage of match win" +loospercentage);
		
	}
}
