package JavaSessions;

//you can call method in main but create outside of main method

public class Students {

	
	String name; 
	int rollNumber; 
	int marks; 
	char gender; 
	
	
public void setStudentName (String name) {
	
	this.name=name; 

	}	

public String  getStudentName  () {
	
	return name; 
}
	
	
	
	public static void main(String[] args) {
		
	//calling method we need create object 
		
		Students obj=new Students(); 

	obj.setStudentName("Tom");
	
	String studentName=obj.getStudentName();
	
	System.out.println(studentName); // first way
	
		obj.name="Kan"; //directly assigned to Class variable
		
		System.out.println(obj.name);
		System.out.println(obj.getStudentName());
		
	}

}
