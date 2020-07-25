package javaPractise;

public class WhileLoopHelloWorld {

	public static void main(String[] args) {


		
		int i = 1; 
		
		while (i<=10) {
			
			
			System.out.println("Hello World");
			
			i++; 
		}
		

			System.out.println("_________");
			
			
			//Write a program in Java to print 1 to 10
			//using while loop but quit if multiple of 7 is encountered
			
			
			int a=1; 
			
			while (a<=10) {
				
				if(a%7==0) {
					
					
					System.out.println("divisible by 7 Found!");
					break;
				}
				System.out.println(a);
				
				a++;
				
				
				}
				
			
			}
	

}
