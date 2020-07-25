package Finalize;

public class Persons {
	
	
	int age ; 
	
	public static void main(String[] args) {
	
		
		Persons p1= new Persons () ; 
		p1=null; 
		System.gc(); // garbage collection to clean memeory
//		p1.age=20 ; 
//		
//		System.out.println(p1.age);
//		
		
	}
	
	public void finalize () {
		
		System.out.println("This is finalize ....");
	}

}
