package pack.com;

import java.util.Scanner;

class FV
{
	double fiv;
	FV(double p,double r,double y)
	{    
		 fiv=p*((1+r/y));
	}
}
public class Interest
{ 
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter the principle value: ");
	double p=sc.nextInt();
	 System.out.print("Enter the interest rate: ");
	 double r=sc.nextInt();
	System.out.print("Enter the time period in years: ");
	 double y=sc.nextInt();  
        
      
      
        FV  e= new FV(p,r,y);
        System.out.println("Year    Future Value");
      
        System.out.print("1 \t"+1*e.fiv+"\n2 \t"+2*e.fiv+"\n3 \t"+3*e.fiv+"\n4 \t"+4*e.fiv+"\n4\t"+5*e.fiv);
                 
    }
}