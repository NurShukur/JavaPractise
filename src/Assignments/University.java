package Assignments;

import java.util.ArrayList;

public class University {

//	
//	1. Design a University class template with the following features:
//		 variables:
//		name
//		country
//		stablishedDate
//		List of course provided in Array List<String>
//		--Design the constructor of this class with different parameters and all parameters.
//		--Write the get method of each variable with return keyword. 
	public String name; 
	public String country; 
	public int establishedDate; 
	public ArrayList <String> courses;
	public University(String name, String country, int establishedDate, ArrayList<String> courses) {
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
		this.courses = courses;
	} 
		University uni1= new University("Stanfor", "USA", 1870, courses); 
		ArrayList <String> stanford=new ArrayList <String> (); 
		
		
		
		
	
	
	
	
}
