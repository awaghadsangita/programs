import java.util.Scanner;
import java.util.Random;

public class TicTacToe_14 {
	static char board[][]=new char[][]{{'1','2','3'},{'4','5','6'},{'7','8','9'}};
	static int position;
	static int count01=0,count02=0,count03=0,count04=0,count05=0,count06=0,count07=0,count08=0,count=0;
	static int countx1=0,countx2=0,countx3=0,countx4=0,countx5=0,countx6=0,countx7=0,countx8=0;
	static boolean[]win=new boolean[] {false,false};
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("The Tic-Toc-Toe Game ");
		try {
//			displayboard();
			do 
			{
				if(count==9)
					break;
				displayboard();
				getValueFromUser();
				count++;
				
				displayboard();
				getValueFromComputer();
				count++;
				
			
				if(count01==3||count02==3||count03==3||count04==3||count05==3||count06==3||count07==3||count08==3)
				{
					win[1]=true;
					break;
				}
				if(countx1==3||countx2==3||countx3==3||countx4==3||countx5==3||countx6==3||countx7==3||countx8==3)
				{
					win[0]=true;
					break;
				}
			}while(win[0]!=true || win[1]!=true);
			if(win[0]==true)
				System.out.println("User Win the Match");
			else if(win[1]==true)
				System.out.println("Computer Win the Match");
			else
				System.out.println("Match Draw");
			
		}catch(Exception e)
		{
			System.out.println("Error Occured"+e.getMessage());
		}
	}
	//Display Board
	public static void displayboard()
	{
		System.out.println();
		for(int row=0;row<3;row++)
		{
			for(int col=0;col<3;col++)
			{
				System.out.print("|"+board[row][col]);
			}
			System.out.println("|");
		}
		System.out.println();
	}
	//Get Position From User
	public static void getValueFromUser()
	{
//		do {
			System.out.println("Enter the Position");
			position=sc.nextInt();
			System.out.println(position);
			switch(position)
			{
				case 1:
						if(board[0][0]=='x'||board[0][0]=='0')
							getValueFromUser();
						else
						{
							board[0][0]='x';
							countx1++;
							countx4++;
							countx7++;
						}
						break;
				case 2:
						if(board[0][1]=='x'||board[0][1]=='0')
							getValueFromUser();
						else
						{
							board[0][1]='x';
							countx1++;
							countx5++;
						}
						break;
				case 3:
						if(board[0][2]=='x'||board[0][2]=='0')
							getValueFromUser();
						else
						{
							board[0][2]='x';
							countx1++;
							countx6++;
							countx8++;
							
						}
						break;
				case 4:
						if(board[1][0]=='x'||board[1][0]=='0')
							getValueFromUser();
						else
						{
							board[1][0]='x';
							countx2++;
							countx1++;
						}
						break;
				case 5:
						if(board[1][1]=='x'||board[1][1]=='0')
							getValueFromUser();
						else {
							board[1][1]='x';
							countx2++;
							countx5++;
							countx7++;
							countx8++;
						}
						break;
				case 6:
						if(board[1][2]=='x'||board[1][2]=='0')
							getValueFromUser();
						else
						{
							board[1][2]='x';
							countx1++;
							countx6++;
						}
						break;
				case 7:
						if(board[2][0]=='x'||board[2][0]=='0')
							getValueFromUser();
						else
						{
							board[2][0]='x';
							countx3++;
							countx4++;
							countx8++;
						}
						break;
				case 8:
						if(board[2][1]=='x'||board[2][1]=='0')
							getValueFromUser();
						else {
							board[2][1]='x';
							countx3++;
							countx5++;
						}
						break;
				case 9:
						if(board[2][2]=='x'||board[2][2]=='0')
							getValueFromUser();
						else {
							board[2][2]='x';
							countx3++;
							countx6++;
							countx7++;
						}
						break;
				default:
                    System.out.println("Please Enter position in between 1-9:");
			}
			
//		}while(position < 1 || position > 9);
	}
	
	//Get Position From computer
		public static void getValueFromComputer()
		{
//			do {
				System.out.println("Computer Turns:");
				Random rand=new Random();
				
				position=rand.nextInt(10);
				System.out.println(position);
				switch(position)
				{
					case 1:
							if(board[0][0]=='x'||board[0][0]=='0')
								getValueFromComputer();
							else
							{
								board[0][0]='0';
								countx1++;
								countx4++;
								countx7++;
							}
							break;
					case 2:
							if(board[0][1]=='x'||board[0][1]=='0')
								getValueFromComputer();
							else
							{
								board[0][1]='0';
								countx1++;
								countx5++;
							}
							break;
					case 3:
							if(board[0][2]=='x'||board[0][2]=='0')
								getValueFromComputer();
							else
							{
								board[0][2]='0';
								countx1++;
								countx6++;
								countx8++;
								
							}
							break;
					case 4:
							if(board[1][0]=='x'||board[1][0]=='0')
								getValueFromComputer();
							else
							{
								board[1][0]='0';
								countx2++;
								countx1++;
							}
							break;
					case 5:
							if(board[1][1]=='x'||board[1][1]=='0')
								getValueFromComputer();
							else {
								board[1][1]='0';
								countx2++;
								countx5++;
								countx7++;
								countx8++;
							}
							break;
					case 6:
							if(board[1][2]=='x'||board[1][2]=='0')
								getValueFromComputer();
							else
							{
								board[1][2]='0';
								countx1++;
								countx6++;
							}
							break;
					case 7:
							if(board[2][0]=='x'||board[2][0]=='0')
								getValueFromComputer();
							else
							{
								board[2][0]='0';
								countx3++;
								countx4++;
								countx8++;
							}
							break;
					case 8:
							if(board[2][1]=='x'||board[2][1]=='0')
								getValueFromComputer();
							else {
								board[2][1]='0';
								countx3++;
								countx5++;
							}
							break;
					case 9:
							if(board[2][2]=='x'||board[2][2]=='0')
								getValueFromComputer();
							else {
								board[2][2]='0';
								countx3++;
								countx6++;
								countx7++;
							}
							break;
					default:
	                    System.out.println("Please Enter position in between 0-9:");
				}
				
//			}while(position < 1 || position > 9);
		}
}
