import java.util.Scanner;
class Input
{
public static void main(String args[])
{
int num;
String name;
Scanner n=new Scanner(System.in);
System.out.println("Enter your name- ");
name=n.nextLine();
Scanner n=new Scanner(System.in);
System.out.println("Enter your number- ");
num=n.nextInt();
System.out.println("My name is- "+name);
System.out.println("My number is- "+num);
}
}