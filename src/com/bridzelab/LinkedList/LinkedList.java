/*
purpose=Lets create a simple Linked List of 56, 30 and 70
* @author= sushmitha
* @since=29-08-2022
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
		
		 //Node current will point to head    
        Node current = head;    
            
        if(head == null) 
        {    
            System.out.println("List is empty");    
               
        }    
        System.out.println("Nodes of simple linked list is: ");    
        while(current != null)
        {    
            //Prints each node by incrementing pointer    
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }    
        
	

} 

