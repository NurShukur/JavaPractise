package Assignments;

import java.util.ArrayList;
import java.util.Collections;

public class MixedAssigments {

	public static void main(String[] args) {
	
//		Question 1: Write a program to print the following pattern using for loop:
		//
//		00 01 02 03 04 05 06 07 08 09 
//		10 11 12 13 14 15 16 17 18 19 
//		20 21 22 23 24 25 26 27 28 29 
//		30 31 32 33 34 35 36 37 38 39 



for (int i = 0 ; i<5 ; i++)

{
	
	for(int j = 0 ; j<5; j++) 
		
		System.out.print(i+""+j+" ");
		
	    System.out.println();
}
//. Write a Java program to create a new array list, add some colors
	//(string) and print out the collection
		
		
		ArrayList <String> color = new  ArrayList(); 
		
		  color.add("blue"); 
		  color.add("red"); 
		  color.add("green"); 
		  color.add("purple"); 

			//System.out.println(color.get(0));
			// System.out.println(color.size());
			
			//color.remove("blue");
			for (String i:color) {
				
				System.out.println(i);
			}
		
		//Question 2: Write a program to create a static Array, having
//		following cricket data:
//			--name, age, team name, DOB, gender, Strike Rate
//			--Try to create multiple Object Arrays for different players 
//			--Try to print all the values of each player on the console
		
		//Array must have similar data type 
		 String name []=new  String[4]; 
		 
		 name [0]="Tom"; 
		 name [1]="Peter";
		 name [2]="John"; 
		 name [3]="William";
		 
		 
		 int age []= new int [4]; 
		 
		
		 age [0]=20; 
		 age [1]=21;
		 age [2]=22; 
		 age [3]=23;
		 
		 
		 String team []=new  String[4]; 
		 
		 team [0]="T"; 
		 team  [1]="P";
		 team [2]="J"; 
		 team [3]="W";
		 
		 int dob []= new int [4]; 
		 
			
		 dob [0]=20; 
		 dob [1]=21;
		 dob [2]=22; 
		 dob [3]=23;
		 
		 
		 char gender []=new  char[4]; 
		 
		 gender [0]='M'; 
		 gender  [1]='M';
		 gender [2]='M'; 
		 gender [3]='M';
		 
		 
		 double rate []= new double [4]; 
		 
			
		 rate [0]=31.5; 
		 rate [1]=25.5;
		 rate [2]=23.7; 
		 rate [3]=40.0;
		
		 System.out.println(name[0]+" "+age[0]+" "+team[0] +" "+dob[0]+" "+gender[0]+" "+gender[0]+" "+rate[0]);
		 System.out.println(name[1]+" "+age[1]+" "+team[1] +" "+dob[1]+" "+gender[1]+" "+gender[1]+" "+rate[1]);
		 System.out.println(name[2]+" "+age[2]+" "+team[2] +" "+dob[2]+" "+gender[2]+" "+gender[2]+" "+rate[2]);
		 System.out.println(name[3]+" "+age[3]+" "+team[3] +" "+dob[3]+" "+gender[3]+" "+gender[3]+" "+rate[3]);
		
		
		
//		2. Write a Java program to insert an element into the array list at the first and last positions.
//
		ArrayList <Integer> num= new <Integer> ArrayList(); 
		
		num.add(5);  //1
		num.add(4);  //2
		num.add(3);  //3
		num.add(15);  //4
		
		
		// before 
		for (int s:num) {
			
			
			System.out.println(s);
		}
 		
		
		System.out.println("_______________");
		// after 
		
		num.add(0, 19);; // add to the first  position 
		num.add(12); // add to the last position 
		
	
		
		
		for (int s:num) {
			
			
			System.out.println(s);
		}
 		

		System.out.println("_______________");
		
//		3. Write a Java program to retrieve an element (at a specified index) from a given array list.
		
		System.out.println(num.get(0));
	
		System.out.println("_______________");
		

//		4. Write a Java program to update specific array element by given element.
		
		num.set(3,40); // on the index 3 element 3 replaced with 40 
		
		for (int s:num) {
			
			
			System.out.println(s);
			
			System.out.println("_______________");
		}
//
//		5. Write a Java program to remove the third element from a array list. 
		
		
		
		for (int s:num) {
			
			
			System.out.println(s);
		}
//
//		6. Write a Java program to search an element in a array list.
		
		

//		7. Write a Java program to reverse elements in a array list
		
		
		ArrayList <String> companies = new <String> ArrayList(); 
		
		companies.add("Facebook"); 
		companies.add("Tesla");
		companies.add("Google");
		companies.add("Apple");
		
		//Collections.reverse(companies);
		
		
		System.out.println(companies);
		
		

//		8. Write a Java program to extract a portion of a array list.
		
		 // Sublist method write first and last index

		System.out.println(companies.subList(0, 2));  //
	}

}
