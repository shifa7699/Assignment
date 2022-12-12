package collection;

import java.util.LinkedList;
import java.util.Scanner;

public class Insert_Position
{
	public static void main(String[] args) {
		LinkedList<String> l1= new LinkedList<String>(); //creating list 
		l1.add("Floor 1");
		l1.add("Floor 2");
		l1.add("Floor 3");
		l1.add("Floor 4");
		l1.add("Floor 5");
		System.out.println("List elements : "+l1);
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the element you want to insert : "); //user input of the element
		String s = sc.next();
		System.out.println("Enter the position of the element you want : "); //user input of the position
		int p =sc.nextInt();
			l1.add(p,s);  // p-->index, s--> element
			System.out.println("Updated list is : "+l1); //After adding the mentioned position and element
		
	}
}
