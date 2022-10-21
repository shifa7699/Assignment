/*Q.1...Write a Java program that reads in two floating-point 
numbers and tests whether they are the same up to 
three decimal places.*/
package pack.com;

import java.util.Scanner;

public class Floating_num 
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the 1st floating point number: ");
    double a = sc.nextDouble();
    System.out.println("Input the second floating-point number: ");
    double b = sc.nextDouble();
    a = Math.round(a * 1000);
    a = a / 1000;

    b = Math.round(b * 1000);
    b = b / 1000;

    if (a == b)
    {
        System.out.println("They are the same up to three decimal places");
    }
    else
    {
        System.out.println("They are different");
    }
}
}


