package com.bridgelabz.DataStructure;

public class CalenderLinkedlist {
	static CalenderNode head=new CalenderNode();
	
	static void insert(int d)// d=>day 0 for Sunday,1 for Monday
	{
		String day[]= {"Sunday","Monday","Thuesday","Wednesday","Thursday","Friday","Saturday"};
//		System.out.println(" "+d);
		int count=0;
		int k=0;
		CalenderNode previous=new CalenderNode();
		for(int j=0;j<2;j++ )
		{
			if(count==0)
			{
				CalenderNode newNode=new CalenderNode();
				newNode.date=0;
//				System.out.print(newNode.date);
				newNode.weekday=day[count];
				head=newNode;
				previous=head;
				count++;
			}
			else
			{
				
				while(count<d)
				{
					CalenderNode newNode=new CalenderNode();
					newNode.date=0;
//					System.out.print(newNode.date);
					newNode.weekday=day[count];

					previous.next=newNode;
					previous=newNode;
					count++;
				}
				//for loop start
				for(int i=1;i<=31;i++)
				{
					CalenderNode newNode=new CalenderNode();
					newNode.date=i;
//					System.out.print(newNode.date);
					newNode.weekday=day[count];
					previous.next=newNode;
					previous=newNode;
					CalenderQue.rear=newNode;
					count++;
					if(count%7==0)
						count=0;
					if(k==31)
						k=1;
				}//for loop end
			
				
			}//end else
		}	
			
	}
	static void show()
	{
		CalenderNode temp=head;
		while(temp!=null)
		{
			System.out.print(temp.date+" ");
			temp=temp.next;
		}
	}
	
	//end insert
	
		
		
	
	
}
