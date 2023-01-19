package com.RMS_Hibernate_CRUD;

import java.util.Scanner;

import com.RMS_Hibernate_CRUD.DaoImpl.DaoImpl;

public class App 
{
    public static void main( String[] args )
    {
    	DaoImpl dao = new DaoImpl();
    	char c;
        do {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Press 1 to Enter and Display the Train Details \n Press 2 to check the Availability of the Train \n"
        			+"Press 3 to check the Price of the Train \n Press 4 to check the number of tickets available\n Press 5 to exit");
        	int a=sc.nextInt();
        	switch(a) {
        	case 1:dao.train_details();
        	break;
        	case 2:dao.train_avail();
        	break;
        	case 3:dao.fetchPrice();
        	break;
        	case 4:dao.Tickets_avail();
        	break;
        	case 5:System.exit(0);
        	break;
        	default:System.out.println("Invalid choice!");
        	}
        	System.out.println("Do you want to continue? Y/N");
        	c=sc.next().charAt(0);
        }while(c=='y'||c=='Y');
        System.out.println("Thank you");
        }
    }

