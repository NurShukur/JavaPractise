package JavaSessions;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// Array list is  a default class
		//Collection(Interface) -- -> LIst(Interface) --ArrayList(Class)
		
		
		ArrayList ar=new ArrayList();
		
		
		System.out.println(ar.size()); //0  
		
		//Physical capacity is how many index written . 
		 
		ar.add(100) ; //  0 index . how we store values 
		ar.add(200) ; //1 index
		ar.add(300) ; //2 index
		
	
		System.out.println(ar.size());//3
		
		
		ar.add(400); 
		ar.add(500); 
		
		System.out.println(ar.size()); //5
		
		System.out.println(ar.get(0)); // first value  index 0 =100 
		
		
		//internal implementation of Array list- Default Virtual capacity of Array is 10 
		//Physical capacity is how many index written . 
		
		//System.out.println(ar.get(5));// if there is not 5th index Out-of Boundry-Exception
		
		
		//System.out.println(ar.get(-1));
		
		ar.add(600); //6
		ar.add(700); //7
		
		System.out.println(ar.size()); //7
		
	ar.add("Naveen"); // 8 I can add String  
	ar.add(true);//9
	ar.add(12.33);  //10 I can add Boolean
		
	

	System.out.println(ar.size()); //7
		
	ar.remove(5); // down element will replace old ones index 
	System.out.println(ar.size()); //7
	System.out.println(ar.get(4));  //500
	
	
	//practical example : Amazon product list : 
	
	
	
	
	// This Concept calls Generic in Java.
	
	ArrayList <Integer> marks=new <Integer> ArrayList(); 
	
	marks.add(12);
	marks.add(13);
	marks.add(14);
	
	
	for(int i :marks) {
		
		
		System.out.println(i);
	}
	
	System.out.println("________________________");
	ArrayList  <Double> score = new  <Double>  ArrayList(); 
	
	score.add(12.33); 
	
	System.out.println(score.get(0));
	
	System.out.println("________________________");
	
	 ArrayList <String> studentList = new <String> ArrayList();
	  
	 studentList.add("Nurlan");//0
	 studentList.add("John"); //1
	 studentList.add("SMith");//2
	 studentList.add(null);//3 null means nothing : not space! not empty! not string!
	 studentList.add("null");//4 
	 
	 
	 System.out.println(studentList.get(0));

	 
	 System.out.println("________________________");
	//to print all the values from ArrayList : for loop 
	 
	for(int i =0; i <studentList.size(); i++) {
		
		
		System.out.println(studentList.get(i));
	}
	
	
	System.out.println("________________________");
	
	//for each loop: We do not maintain index here 
	
	for (String  s:studentList) {
		System.out.println(s); // you do not need to write get method
	}
	
	
	
	
	
	
	
	
	
	}

}
