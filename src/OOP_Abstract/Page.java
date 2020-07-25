package OOP_Abstract;

public abstract class Page {
	
	
	public Page () {
		
		
		System.out.println("Page class -- const");
	}
	abstract void header (); 
	abstract void title (); 

	
	public final void footer () {
		 
		System.out.println("HP -user details");
		

	 }
	
	// can not create object of abstract class 
	// abstract calls contstructor can be created 
	// it will be called when you create child class object 
	//abstraction class can have abstract  and non abstract methods -   partial abstraction 
	// abstraction class can have all abstract methods  -100% abstraction. 
	//  abst class can have all non abst  methods .  0% abstraction
	
	
	
}
