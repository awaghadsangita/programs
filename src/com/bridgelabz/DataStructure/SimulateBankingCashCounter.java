package com.bridgelabz.DataStructure;
import java.util.*;
public class SimulateBankingCashCounter {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int availableCash=50000;
		
		int choice;
		Queue que=new Queue();
		System.out.println("Availble Cash :"+availableCash);
		
		do {
			System.out.println("Availble Cash :"+availableCash);
			System.out.println("\n1.Deposit\n2.Withdrawal\n3.Add Person in Queue\nEnter your Choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				if(que.isEmpty())
				{
					System.out.println("Queue is EMPTY cannot deposit");
					break;
				}
				else
				{
					System.out.println("Enter the Amount to Deposit");
					int depositAmt=sc.nextInt();
					que.dequeue();
					
					que.showQue();
					break;
				}
			case 2:
				if(que.isEmpty())
				{
					System.out.println("Queue is EMPTY cannot Widthdraw");
					break;
				}
				else
				{
					
					System.out.println("Enter the Amount for withdraw");
					int withdrawAmt=sc.nextInt();
					if(availableCash>withdrawAmt)
					{
						availableCash=availableCash-withdrawAmt;
						que.dequeue();
						
						que.showQue();
					}
					else
						System.out.println("Bank Does NOT have Enough Cash for withdraw");
					
					break;
				}
			
			case 3:
					System.out.println("How many People You want to add in Queue");
					int noOfPerson=sc.nextInt();
					for(int i=0;i<noOfPerson;i++)
						que.enqueue();
					System.out.println("Queue Status");
					que.showQue();
					break;
			default:
					System.out.println("Enter choice between 1 to 4");
				break;
				
			}	
		}while(choice!=4);
	}
}
