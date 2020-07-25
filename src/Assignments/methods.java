package Assignments;

public class methods {


	 public static void main(String[] args) {
			
		 ClassObjects obj= new ClassObjects(); 
		 
		int sum= obj.DisplaySum(5,4); 
		
		System.out.println(sum);
		System.out.println("**********");

			
			int product = obj.DisplayProduct(2, 5); 
			
			System.out.println(product);
			
			System.out.println("**********");
			double area=obj.area(5); 
			
			System.out.println(area);
			System.out.println("**********");
			
			
			double circumference=obj.circumference(5);
			
			System.out.println(circumference);
			System.out.println("**********");
			
			String max=obj.max(1, 2, 3) ;
			
			System.out.println(max);
			System.out.println("**********");
			
			String min=obj.min(4, 2, 3) ;
			
			System.out.println(min);
			System.out.println("**********");
			
			
			String evenOrOdd=obj.evenOrOdd(5);
			
			System.out.println(evenOrOdd);
			System.out.println("**********");
			
		
			String voteAge=obj.voteAge(19);
			
			System.out.println(voteAge);
			System.out.println("**********");
			
			

			
	}

}

