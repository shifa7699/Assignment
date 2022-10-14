package pack.com;

import java.util.Scanner;

public class N_numbers 
{
	public static void main(String args[])
	{
		int n,i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entetr the number:- ");
		n=sc.nextInt();
		for(i=1;i<=n;i+=2)
		{
			sum+=n;
		}
		System.out.println("Sum of ODD numbers are:- "+sum);
	}
}
