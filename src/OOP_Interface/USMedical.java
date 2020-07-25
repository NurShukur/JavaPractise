package OOP_Interface;

public interface USMedical {
	
	int min_fee=10; 
	// can I create variable here ? Yes. 
	
	
	//Abstracts methods . 
	public  void orthoServices() ;  // interface methods can not accept body. we do not write here business logic

	public void neuroServices() ;
	
	public void  Services_911 (); 
	
	
	
	// camn not create object of Interface; 
	// can not have method body 
	// can have only method prototype or method declaration. 
	// interface variables are bydefault static and final ( no one can chance it )
	// static in nature because we can not have objects in interface
	// we can not have static method prototypes in interface . 
	// Interfaces can not be overloadding . 
	// static methods can not be overridden .
	
	
	//after JDK 1.8 
	
	//1. can have static method with method body. 
	
	public static void display ()  { // static method 
		
		System.out.println("USMedical - display");
	}
	
	//2. can have default method with body. 
	
	default void billing ()   { // inherrited method
		
		System.out.println("USMedical - billing "); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
