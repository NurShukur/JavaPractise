package Assignments;

import java.util.ArrayList;

public class Color {

	public static void main(String[] args) {
	//. Write a Java program to create a new array list, add some colors
	//(string) and print out the collection
		
		
		ArrayList <String> color = new  ArrayList(); 
		
		  color.add("blue"); 
		  color.add("red"); 
		  color.add("green"); 
		  color.add("purple"); 

			//System.out.println(color.get(0));
			// System.out.println(color.size());
			
			
			for (String i:color) {
				
				System.out.println(i);
			}
	}

}
