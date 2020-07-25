package Assignments;

public class ClassObjects {

	//Write a program to print the sum of two numbers entered by user by defining your own method.

	 public  int  DisplaySum(int a, int b ) {
		 
		 int sum=a+b;  
		 return sum;  
	 }
	
	 //2. Define a method that returns the product of two numbers entered by user.
	 
	 
	 public int  DisplayProduct(int a, int b) {
		 
		 int product=a*b; 
		 return product ;
	 }
	 
 //Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
	 
	 //A=pr^2    area of circle
	 
	
	   
	 public double area(int r) {
		 
		  final double p =3.14;
		 
		  double area=p*r*r; 

		  return area; 
	 }
	 //C=2pr  circumference of circle
	 
	 
	 public double circumference(int r) {
		 
		  final double p =3.14;
		 
		  double circumference=2*p*r; 

		  return circumference ;  }
	 
	//Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
		  
		 public  String  max(int a ,int b, int c) {
			  
			if (a>b && a>b) {	
				return "a is maximum number";
			}
			else if (b>c) {	
				return "b is a maximum number ";
			}
			else {
				return "c is maximum number";
			}
		
		  }
		 
		 
		 public  String  min(int a ,int b, int c) {
			  
				if (a<b && a<c) {	
					return "a is minimum number";
				}
				else if (b<c) {	
					return "b is a minimum number ";
				}
				else {
					return "c is minimum number";
				}
			
			  }
		 
		 //Define a program to find out whether a given number is even or odd.
		 
		 public String evenOrOdd(int a) {
			 
			 if (a%2==0) {
				 
				 return "Your number is even" ; 
				 
			 }
			 
			 else {
				 
				 return "Your number is odd "; 
			 }
			 
		 }
		 
		// A person is eligible to vote if his/her age is greater than or equal to 18. 
		//Define a method to find out if he/she is eligible to vote.
		  
		 public String voteAge(int a) {
			 
			 if  (a>=18) {
				 return "You are eligible to vote";
			 }
			 else  {
				 
				 return "You are illigable to vote ";
			 }
		 }
		 
		 
		 
	 }



