package javaPractise;

import java.util.ArrayList;

public class JavaArrayList {

	public static void main(String[] args) {
		
		
		// Print all the value of Arry list 
ArrayList <String> names = new ArrayList(); 
		
		names.add("Nurlan");  //0
		names.add("Sabit"); //1
		names.add("Kamal"); //2
		names.add(null); //3
		names.add("Fikret");  //4
		
		names.add(0, "Rizvan");
		
		System.out.println(names);
		
		names.set(1, "Zakir"); 
		
		System.out.println(names);
		
		
		names.clear();
		

		System.out.println(names);
		
	//	System.out.println(names.contains("nurlan"));
		
	
		
	//System.out.println(names.get(1));
	//System.out.println(names.size());
	
System.out.println("______________");
		
		for(String s:names) {
			
			//System.out.println(s);
		
			
		}
		
	}
	}


