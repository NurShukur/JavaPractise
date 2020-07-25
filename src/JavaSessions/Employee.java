package JavaSessions;

public class Employee {
	
	String name="Tom "; // class variable 
	int age= 25; 
	double Salary =12.33; 
	boolean isCitizen=true; 
	
	String deptname;
	
	// we can not access class variable without object in the Main method 

	public static void main(String[] args) {

		// Always use new keyword ; 
		
		
		int i = 10 ;  // local variable
		Employee obj = new Employee ();  // Obj is reference of Object 
		
		// new Employee () - is the object 
		
		
		System.out.println(obj.name);
		
		System.out.println(obj.age);
		
		System.out.println(obj.Salary);
		
		System.out.println(obj.isCitizen);
		
		System.out.println(obj.deptname);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
