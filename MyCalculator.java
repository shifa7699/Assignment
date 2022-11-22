//Q...3
package exception;

import java.io.IOException;
public class MyCalculator 
{
	static  long power(int n, int p) throws Exception
	{
		double d=Math.pow(n, p);
		if(n<0 || p<0) {
			throw new Exception("n or p should not be negative");
		} else if(n==0 || p==0) {
			throw new IOException("n or p should not be zero");
		} else {
			return (long) d;
		}
	}
	public static void main(String[] args) throws Exception {
		System.out.println(power(4,3));
	}
}
