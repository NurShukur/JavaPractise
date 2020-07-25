package ExceptionHandling;

public class TryCatchBlock {
	
	// Exception is  any unwanted behavior.  Error is totally depended on System hardware. ( memory stack and etc) 
	// Java will create Exception object by default 
// Throwable is parent of Exception class. if you are not sure error or exception we use throwable  key word . 

	public static void main(String[] args) {
		
		
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		 try {
			 System.out.println("B"); 	// before exception whatever you write will be excuted
			 int i=9/0;
		 System.out.println("B");// after exception . it will never executed . because exception first. 
		 } 
		 catch (ArithmeticException e) {
			System.out.println("we got an exception ...");
			e.printStackTrace();
			System.out.println(e.getMessage());
		 }
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
	}

}
