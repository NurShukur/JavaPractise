package JavaSessions;

public class StringMerge {

	public static void main(String[] args) {
	
		
	

	 //String is a class and non-primitive data type 
		String x ="Hello";
		String y = "World"; 
		
		
		int h = 100; 
		int g= 200; 
		
		
		System.out.println(h+g);
		System.out.println(x+y);
		
		System.out.println(x+y+h+g);
		
		double d1=12.33; 
		double d2=34.44; 

		System.out.println(x+y+(h+g));
		
		System.out.println(x+y+d1+d2+h+g);
		
		int total = 100; 
		
		int tax = 30; 
		
		System.out.println("total amount is : " +total+tax) ; //wrong one
		System.out.println("total amount is : " +(total+tax) ); //correct one
		
		System.out.println(1000+200); // correct 
		
		 System.out.println("Hello"+" "+"World");
		
		
	}

}
