//Write a program to find the factorial of any number(user input)
import java.util.Scanner;
class Factorial 
{
public static void main(String args[])
{
int i,n,fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");//6
int n=sc.nextInt();
for(i=1;i<=n;i++)
{
fact=fact*i;//1*1, 1*2, 2*3, 6*4, 24*5, 120*6
}
System.out.println("Factorial of the number is: "+fact);//720
}
}
}