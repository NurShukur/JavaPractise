package OOP_inheritance;

public class Car extends Vehicle {
	
	//class can not have more than one parent
	// class can have more childs. 
	// child can take from parent and grandparent too
	// Multi level is allowed . but Multiple is not allowed like diamond problem. To solve this we use interface
	//Final method can not be ovverriden. we add final is used  to prevent overridden. 
	//Final class an not be a paretn calss - final is used to prevent inheritance . 
	
	public void start () {
		
		System.out.println("car can start");
	}
	
	public void stop () {
		
		System.out.println("car can stop");
	}

	public void refuel () {
		
		System.out.println("car can refuel");
	}
}
