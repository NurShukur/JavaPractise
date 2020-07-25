package javaPractise;

public class voteelligibility {

	public static void main(String[] args) {
		
		//. Write a Java program to check the eligibility for vote.
		//if age is equal and above 18 then only you can vote else you can't.
		//if you have not been living for more than 3 years, you cant vote.
		
		int age=18; 
		
		int living=2; 
		
		
		if (age>=18 && living >=3) {
			
			System.out.println("you can vote");
		}
		
		else  {
			
			System.out.println("you can not vote");
		}
	}

}
