/*
purpose=Lets create append method and add the data like 56, 30 and 70
* @author= sushmitha
* @since=02-09-2022
*/


package com.bridzelab.LinkedList;

class LinkedList 
{
	Node head = null;
	Node tail = null;

	
	public void insert(int data)
	{
		
		//Create a new node    
        Node newNode = new Node(data);    
            
        //Checks if the list is empty    
        if(head == null) 
        {    
            //If list is empty both head and tail will point to new node    
            head = newNode;    
            tail = newNode;    
        }    
        else 
        { 
        	
            //newNode will be added after tail such that tail's next will point to newNode    
            tail.next = newNode;    
            //newNode will become new tail of the list    
            tail = newNode;    
        }    
    }    
	public void show()
	{
		
		if(head == null)
		{
            System.out.println("Linked List is Empty.");
        } 
		else 
		{
            Node current = head;
        
            while(current != null)
            {    
            //Prints each node by incrementing pointer    
            System.out.print(current.data + "==>");    
            current = current.next;    
            }    
		}    
        
	}
	public void append(int data)
	{
		
		//Create a new node    
        Node newNode = new Node(data);    
            
        //Checks if the list is empty    
        if(head == null) 
        {    
            //If list is empty both head and tail will point to new node    
            head = newNode;    
            tail = newNode;    
        }    
        else 
        { 
        	
            //newNode will be added after tail such that tail's next will point to newNode    
            tail.next = newNode;    
            //newNode will become new tail of the list    
            tail = newNode;    
        }    
    }    
}