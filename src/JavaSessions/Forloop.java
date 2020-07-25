package JavaSessions;

public class Forloop {

	public static void main(String[] args) {

	/*	for(int k=1;k<=10;k++)   //declare variable and initialize ;set condition; Increment
		
		{        
			
		System.out.println(k); //1 2 3 4 5 6 7 8 9 10
		
		System.out.println(k);
			*/
		
		//for (; ; ) {
			
			//System.out.println("Welcome");
			
			//Condition always true for JAva interview question  no any condition
			
		// odd numbers; 
//			for (int odd=1; odd<10; odd=odd+2) {
//				
//				System.out.println(odd); // 1 3 5 7 9
				
		
		
		// even  numbers; 
		for (int even=0; even<10; even=even+2) {
			
		System.out.println(even); // 1 3 5 7 9
		
		
	
		}
		
		System.out.println("-----------------------");
		
		
		
		// for with if : 
		
	
		for(int m=1; m<=100;m++) {
			
			if(m%5==0) {
				System.out.println(m);
				
				System.out.println("Hi Five");
			}
			
			else {
				
				System.out.println("*");
			}
			
		} 
		System.out.println("___________");
		
		
		for (int num=1; num<=10; num ++) {
			
			System.out.println(num);
			
			if(num%7==0) {
				
				System.out.println("number is divisible , bye!!!");
				break;  // works for only loops or switch not for if conditions
			}
		}
		
		
		System.out.println("______________");
		
		
		//3. do- while: 
		
		int count= 21; 
		
		do {
			
			System.out.println(count); //21 20 _______ 1 0 
		
			count--; 
			
		}
		
		while (count>=0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}  					  
	}


