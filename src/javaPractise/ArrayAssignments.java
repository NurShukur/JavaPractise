package javaPractise;

public class ArrayAssignments {

	public static void main(String[] args) {
		
		
		// Question 1: Write a program to print the following
		// pattern using for loop:

			//00 01 02 03 04 05 06 07 08 09 
			//10 11 12 13 14 15 16 17 18 19 
			//20 21 22 23 24 25 26 27 28 29 
			//30 31 32 33 34 35 36 37 38 39 

		
		int ar []= new int [10]; 
		
		
		ar[0]=00; 
		ar[1]=01; 
		ar[2]=02; 
		ar[3]=03; 
		ar[4]=04; 
		ar[5]=05; 
		ar[6]=06; 
		ar[7]=07; 
		ar[8]=01; 
		ar[9]=02;
		
		
int ar1 []= new int [10]; 
		
		
		ar1[0]=00; 
		ar1[1]=01; 
		ar1[2]=02; 
		ar1[3]=03; 
		ar1[4]=04; 
		ar1[5]=05; 
		ar1[6]=06; 
		ar1[7]=07; 
		ar1[8]=01; 
		ar1[9]=02;
		
		
		for ( int a:ar) {
			
			for (int b:ar)
			
				System.out.println(a+b);
			
			
		}
		
}

}

