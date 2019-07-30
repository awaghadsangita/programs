package com.bridgelabz.DataStructure;

public class HashLinkedList {
	HashNode[] head=new HashNode[11];
	
	public void insert(int data)
	{
		int pos=data%11;
		HashNode newNode=new HashNode();
		newNode.data=data;
		newNode.next=null;
		HashNode previous=head[pos];
		if(previous==null)
		{
			previous=newNode;
			head[pos]=previous;
			
		}
		else
		{
		
			while(previous.next!=null)
			{
				previous=previous.next;
			}
			previous.next=newNode;
//			HashNode current=previous;
//			current.next=newNode;
		}
	}
	public void show()
	{
		for(int i=0;i<head.length;i++)
		{
			HashNode previous=head[i];
			System.out.print("Slot "+i+"  :");
			while(previous!=null)
			{
				System.out.print(previous.data+" ");
				previous=previous.next;
			}
			System.out.println();
		}
	}
	public int find(int num)
	{
		int index=-1;
		int pos=num%11;
		HashNode tmp=head[pos];
		int count=0;
		while(tmp!=null)
		{
			count++;
			if(num==tmp.data)
			{
				index=count;
				break;
			}
			tmp=tmp.next;
		}
		return index;
	}
	public void delete(int search)
	{
		int slot=search%11;
		HashNode previous=head[slot];
		int count=1;
		int pos=find(search);
		if(pos!=1)
		{
			while(count<pos-1)
			{
				previous=previous.next;
				count++;
			}
			HashNode currentNode=previous.next;
			previous.next=currentNode.next;
			currentNode.next=null;
		}else
		{
			head[slot]=null;
		}
				
//		while(previous.next!=null)
//		{
//			count++;
//			previous=previous.next;
//		}
//		if(count==0)
//		{
//			head[slot]=previous.next;
//		}
//		else
//		{
//			HashNode current=previous;
//			previous.next=current.next;
//		}
	}
}