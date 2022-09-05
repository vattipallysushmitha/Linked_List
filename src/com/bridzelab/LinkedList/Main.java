package com.bridzelab.LinkedList;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args) 
	{
		//welcome  from  user to print the message
		System.out.println("******************************************");
		System.out.println("Welcome to Linked List in data structure " );
		System.out.println("******************************************");
		    
		        Scanner sc = new Scanner(System.in);

		        LinkedList linkedList = new LinkedList();

		        int choose;
		        do
		        {
		            System.out.println("\nchoose the option what you need to enter");
		            System.out.println("1. Inser First \n2. Insert Last \n3. Display List \n4. Insert at nth position \n5. Exit \n6. choose the Operation : ");
		            choose = sc.nextInt();

		            switch (choose) 
		            {
		                case 1:
		                    System.out.println("Enter the Data to Insert at First : ");
		                    int dataFirst = sc.nextInt();
		                    linkedList.insertFirst(dataFirst);
		                    break;
		                case 2:
		                    System.out.println("Enter the Data to Insert at Last : ");
		                    int dataLast = sc.nextInt();
		                    linkedList.insertLast(dataLast);
		                    break;
		                case 3:
		                    linkedList.showLinkedList();
		                    break;
		                case 4:
		                    System.out.println("Enter the Data After which to Insert New Data : ");
		                    int nthData = sc.nextInt();
		                    System.out.println("Enter the Data : ");
		                    int data = sc.nextInt();
		                    linkedList.insertNthPosition(data,nthData);
		                    break;
		            }
		        }
		        while(choose != 6);
		    }
	}