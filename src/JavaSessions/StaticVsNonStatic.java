package JavaSessions;

public class StaticVsNonStatic {

	// static only for class variable 
String name; 

static int age; 


public void getName () {
	
	System.out.println("get Name ...");
}

public static void display() {
	
	System.out.println("get Name ...");
}

		public static void main(String[] args) {
			
			
			
			// how to call static vars and methods: no need to create the object .
			
			//a . direct calling.
			display (); 
			
			age=25; 
			
			System.out.println(age);
			
			// b. by using class name
			
			StaticVsNonStatic.display();
			System.out.println(StaticVsNonStatic.age);
		
			
			//how to call non static stuff : need to create the object 
			
			StaticVsNonStatic obj= new StaticVsNonStatic(); 
			
			obj.getName();
			
			obj.name="Vimal"; 
			
			System.out.println(obj.name);
			
			System.out.println(obj.age);
			
			obj.display();
			
			
			
	}
}
