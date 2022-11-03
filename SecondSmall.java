/* Write a Java program to find the 
 * second smallest element in an array.*/

package pack.com;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmall 
{
	public static void main(String[] args) {
		int arr[]= {23,67,54,45,78,98};
		int n=0;
		System.out.println("The array is");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		Arrays.sort(arr);
		System.out.println("The second smallest no is "+arr[1]);
	}}

