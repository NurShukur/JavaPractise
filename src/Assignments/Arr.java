package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Arr {

	public static void main(String[] args) {

	//1.Write a Java program to create a new array list, add some colors (string) and print out the collection.
		
		ArrayList <String > color = new ArrayList <String> (); 
		
		color.add("blue");
		color.add("green");
		color.add("red");
		color.add("white");

	
			
			System.out.println(color.get(0)); // print one only 
			
			
			System.out.println(color); // print horizontally  [blue, green, red, white]
			System.out.println("*************");
			//Write a Java program to iterate through all elements in a array list. 
			
		
			
			for (String i:color) {
				
				System.out.println(i);  // print all via loop  vertically  

		}
			System.out.println("*************");
			//Write a Java program to insert an element into the array list at the first position.
			
			color.add(0, "black");
			
			System.out.println(color);
			
			System.out.println("*************");
		
			//Write a Java program to retrieve an element (at a specified index) from a given array list
			
			String element = color.get(2);
			
			System.out.println(element);
			
			
			System.out.println("*************");
			
			
			//Write a Java program to update specific array element by given element
			
			
			System.out.println(color);
			String update=color.set(4,"yellow");
			
			System.out.println(color); // print new list
			
			System.out.println(update);// updated old value
			
			System.out.println("*************");
			
			
			//Write a Java program to remove the third element from a array list.
			
			color.remove(3) ; //
			
			
			System.out.println(color); // print new list
			
			
			System.out.println("*************");
			
			
			
		
				//Search an element in a array list
			
				if(color.contains("green")) {
			
				System.out.println("Found");
				
				
		} 
				
				else {
					System.out.println("Not Found");
				}
			
			

				System.out.println("*************");
			
			
			//Write a Java program to sort a given array list.
			
			System.out.println(color);
			Collections.sort(color);
			System.out.println(color);
			
			
			ArrayList <String> color1=new ArrayList <String>  (); 
			
			color1.add("b");
			color1.add("g");
			color1.add("r");
			color1.add("w");
			

			
			Collections.copy(color1,color);  // Copy of ArrayList
			System.out.println(color.size());
			
			System.out.println(color1);
			
			
			System.out.println("*************");
			
			
	ArrayList <Integer> numbers=new ArrayList <Integer> (); 
			
			numbers.add(1);
			numbers.add(2);
			numbers.add(0);
			numbers.add(7);
			numbers.add(9);
			
			//Write a Java program to shuffle elements in a array list.
			
			
			System.out.println(numbers);
			Collections.shuffle(numbers);
			System.out.println(numbers);
			
			
			
			//Write a Java program to reverse elements in a array list
			
			System.out.println("*************");
			
			System.out.println(numbers);
			Collections.reverse(numbers);
			System.out.println(numbers);
			
			//Write a Java program to extract a portion of a array list
			
			System.out.println("*************");
			
			List <Integer>  extract =numbers.subList(0, 3);
	
				System.out.println(extract);
			
				
				//Write a Java program to compare two array lists
				
				System.out.println("*************");
				
				Collections.copy(color, color1);
				
				boolean flag= color.equals(color1); 
				
				System.out.println(flag);
				
				
				
				
		}
		
		
}
