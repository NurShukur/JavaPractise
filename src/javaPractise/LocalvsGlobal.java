package javaPractise;

public class LocalvsGlobal {

	
	//Global variable - class variables 
	
	String name = "Tom"; 
	int age= 25; 
	
	public static void main(String[] args) {
	
		LocalvsGlobal str1= new LocalvsGlobal(); 
		
	int i = 10 ; // local var
	
	System.out.println(str1.name);
	
	}

}
