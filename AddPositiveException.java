//Q...2
package exception;

public class AddPositiveException 
{
	static void AddTwoPositive(int x,int y) throws ArithmeticException
	{
			if(x<0 || y<0) 
		{
				throw new ArithmeticException("Non-Positive Integer");
		} else {
			System.out.println("The sum of the numbers is: "+(x+y));
		}
	}
	public static void main(String[] args) {
		AddTwoPositive(8,5);
	}
}
