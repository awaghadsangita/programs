package com.bridgelabz.DataStructure;

public class LinkedList {
    public Node head;
    
    public Node List()//add item at start of list
    {
    	Node newNode=new Node();
    	newNode.data="";
    	newNode.next=null;
    	return newNode;
    	
    }
    public boolean Search(String item)
	{
		boolean isFind=false;
		Node temp=head;
		while(temp!=null)
		{
			if(temp.data.compareTo(item)==0)
			{
				isFind=true;
				break;
			}	
			temp=temp.next;
		}
		return isFind;
	}
    public boolean isEmpty()
	{
		if(head==null)
			return true;
		else
			return false;
	}
    public int size()
	{
		Node node=head;
		int count=0;
		while(node!=null)
		{
			count++;
			node=node.next;
		}
		return count;
	}
	public void append(String data)
	{
			Node node=new Node();
			node.data=data;
			node.next=null;
		
			if(head==null)
			{
				head=node;
			}
			else
			{
				Node temp=head;
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				temp.next=node;
			}

	}
	//insert at Position pos
	public void insert(int pos,String s)
	{
		Node newNode=new Node();
		Node previous=head;
		Node current=previous.next;
		newNode.data=s;
		int count=1;
		if(pos==1)
		{
			
			newNode.next=previous;
			head=newNode;
		}
		else
		{
			while(count<pos-1)
			{
				previous=previous.next;
				count++;
			}
			
			newNode.next=current;
			previous.next=newNode;
		}
		
		
	}
	
	public int index(String item)
	{
		Node temp=head;
		if(head!=null)
		{
			int position=0;
			while(temp!=null)
			{
				position++;
				if(temp.data.compareTo(item)==0)
				{
					break;
				}
				temp=temp.next;
			}
			return position;
		}
		else
			return -1;
	}
	public String Pop(int pos)
	{
		Node previousNode=head;
		int count=1;
		while(count!=pos-1)
		{
			count++;
			previousNode=previousNode.next;
		}
		Node currentNode=previousNode.next;
		previousNode.next=currentNode.next;
		String data=currentNode.data;
		currentNode.next=null;
		
		return data;
		
	}
	public String Pop()
	{
		Node last=head;
		Node previousToLast=null;
		while(last.next!=null)
		{
			previousToLast=last;
			last=last.next;
		}
		String data=last.data;
		previousToLast.next=null;
		return data;
		
	}
	public void show()
	{
		Node temp=head;
		int count=0;
		while(temp!=null)
		{
			
			System.out.print(temp.data+" ");
			temp=temp.next;
			count++;
		}
			
		System.out.print("\n ");
	}
	
}
