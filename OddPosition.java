package pack.com;

public class OddPosition
{
	public static void main(String args[]) //main method
	{
		int n[]= {11,21,22,33,10,9,15}; //declaration of array
		for(int i=0;i<n.length;i+=2) //for loop to print numbers at odd position
		System.out.print(n[i]); //printing the values
	}
}
