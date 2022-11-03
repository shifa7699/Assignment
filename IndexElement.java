/*Write a Java program to find 
 * the index of an array element.*/

package pack.com;

import java.util.Scanner;

public class IndexElement 
{
	public static void main(String args[])
	{
		int arr[]=new int[10];
		int i,n;
		for(i=0;i<10;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the numbers:- ");
			arr[i]=sc.nextInt();
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find its index position");
		n=sc.nextInt();
		for(i=0;i<10;i++) {
		if(arr[i]==n)
		{
			System.out.println(n+" Found at Index "+i);
		}
		}
	}
}
