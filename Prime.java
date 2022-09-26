import java.util.Scanner;
class prime 
{
public static void main(String args[])
{
int num,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:- ");
num=sc.nextInt();
for(i=1; i<=num; i++)
{
if(num%2==0)
{
System.out.println("NOT a prime number");
}
else
{
System.out.println("It is a prime number");
}
}
}
}