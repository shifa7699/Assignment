package collection;

import java.util.Collections;
import java.util.LinkedList;

public class ShuffleList 
	{
		public static void main(String[] args) {
			LinkedList<String> l1= new LinkedList<String>(); //creating list 
			l1.add("Rose");
			l1.add("Hibiscus");
			l1.add("Lily");
			l1.add("Daisy");
			l1.add("Lotus");
			System.out.println("List elements : "+l1); //prints list elements
			Collections.shuffle(l1);  //method to shuffle
			System.out.println("After shuffling : "+l1); //After shuffle the list elements
			}
			
	}


