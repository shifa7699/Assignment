/*Q.2..Write a program in Java to display the cube of the number
 up to given an integer*/
package pack.com;

import java.util.Scanner;

public class Cube 
{
	public static void main(String args[])
	{
		int n,i,cu;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			cu=i*i*i;
			System.out.println(cu);
		}
	}
	
}
