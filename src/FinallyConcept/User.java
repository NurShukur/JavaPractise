package FinallyConcept;

public class User {

	
	public static void test () {
		
		System.out.println("Hii");
		
		try {
		int i=9/0; 
		
		}
		
		catch (NullPointerException e) {
			
			System.out.println("divide by zero eror");
		}
	
		finally  {
		
		System.out.println("This is finally you can not stop me" );  } 
		
	
}
	
	
	
	public static void main(String[] args) {
	
		test () ; 
		
		
	

	}

}
