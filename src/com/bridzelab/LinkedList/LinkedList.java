/*
purpose=Lets delete last node from given data
* @author= sushmitha
* @since=06-10-2022
*/
package com.bridzelab.LinkedList;

class LinkedList 
{
	int location = 0;

    Node head;
    Node tail;
    //Insert Data in New Node
    public void insertFirst(int data)
    {
        Node newNode = new Node(data);
        //Adding Data in Node
        if(head == null) 
        {
            head = newNode;
            tail = newNode;
        } 
        else 
        {
            newNode.next = head;
            head = newNode;
        }
        location++;
        System.out.println("Location:"+location);
    }

    //Insert Data from Last
    public void insertLast(int data)
    {
        Node newNode = new Node(data);
        if(tail == null)
        {
            head = newNode;
            tail = newNode;
        } 
        else 
        {
            tail.next = newNode;
            tail = newNode;
        }
        location++;
        System.out.println("Location of the node:"+location);
    }

    //Insert New Node after Given Node
    public void insertNthPosition(int data,int nthdata)
    {
        Node newNode = new Node(data);
        if(head == null) 
        {
            head = newNode;
            tail = newNode;
        } 
        else 
        {
            Node temp = head;
            Node nextNode;
            while (temp != null) 
            {
                nextNode = temp.next;
                if(temp.data == nthdata)
                {
                    temp.next = newNode;
                    newNode.next = nextNode;
                }
                temp = temp.next;
            }
        }
    }
    //Method to Delete First Node from Linked List
    public void deleteFirst()
    {
       
           head = head.next;
        
    }
    //Method to Delete Last Node from Linked List
    public void deleteLast() 
    {
        if(head == null)
        {
            System.out.println("Linked List is Empty.");
        } 
        else 
        {
            Node second_Last = head;
            while(second_Last.next.next != null)
                second_Last = second_Last.next;
                second_Last.next = null;
        }
    }


    //Display Node in Linked List
    public void showLinkedList()
    {
        if(head == null)
        {
            System.out.println("Linked List is Empty.");
        } 
        else 
        {
            Node temp = head;
            while (temp != null) 
            {
                System.out.print(temp.data + " ==> ");
                temp = temp.next;
            }
        }
    }

}