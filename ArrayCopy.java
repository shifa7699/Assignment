/*Write a Java program to 
 copy an array by iterating the array.*/

package pack.com;

public class ArrayCopy {

	public static void main(String[] args) 
	{
		int[]arr= {23,78,56,76,90};
		int[]copy=arr;
		System.out.println("The original array is");
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]+" ");
			
		}
		System.out.println("The copied array is");
		for(int i=0;i<copy.length;i++) {
			System.out.println(arr[i]+" ");
			
	}
	}
}

