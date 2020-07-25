package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistMethods {

	
	// do not give same name as ArrayList 
	public static void main(String[] args) {

		
		ArrayList <String> students= new ArrayList <String> (); 
		
		students.add("Tom"); 
		
		students.add("Peter"); 
		
		students.add("Nick"); 
		
		students.add("Charlie");
		
		students.add("Bruno"); 
		
		System.out.println(students);
		
		
		//Collections.sort(students);   // Sort arraylist
		
		//System.out.println(students);
		
		
		//Arraylist to Array ;
		
		String arr[]=new String [students.size()];
		
		// convert arraylist to array  ; use toArray(); 
		
		students.toArray(arr);
		
		
		
		for  (int i=0 ; i <arr.length; i++ ) {
			
			
			System.out.println(arr[i]);
		}
		
		
		
		
	// Array to ArrayList  : use asLIst(); 
		
		String lang[]=new String [3];
		
		
		lang[0]="Java";
		lang[1]="Python";
		lang[2]="Ruby";
		
		
		//ArrayList <String> langList = new ArrayList <String>(Arrays.asList(lang));
		
		
		//arraylist to String 
		
		
ArrayList <String> students1= new ArrayList <String> (); 
		
		students1.add("Tom"); 
		
		students1.add("Peter"); 
		
		students1.add("Nick"); 
		
		
		System.out.println(students1); // Arraylist representation 
		
		 //convert ArrayLIst to String;
		
		System.out.println(students1.toString()); // String representation 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
