package Assignments;

public class CricketData {

	public static void main(String[] args) {
	
		
		
//		Question 2: Write a program to create a static Array, having
//		following cricket data:
//			--name, age, team name, DOB, gender, Strike Rate
//			--Try to create multiple Object Arrays for different players 
//			--Try to print all the values of each player on the console
		
		//Array must have similar data type 
		 String name []=new  String[4]; 
		 
		 name [0]="Tom"; 
		 name [1]="Peter";
		 name [2]="John"; 
		 name [3]="William";
		 
		 
		 int age []= new int [4]; 
		 
		
		 age [0]=20; 
		 age [1]=21;
		 age [2]=22; 
		 age [3]=23;
		 
		 
		 String team []=new  String[4]; 
		 
		 team [0]="T"; 
		 team  [1]="P";
		 team [2]="J"; 
		 team [3]="W";
		 
		 int dob []= new int [4]; 
		 
			
		 dob [0]=20; 
		 dob [1]=21;
		 dob [2]=22; 
		 dob [3]=23;
		 
		 
		 char gender []=new  char[4]; 
		 
		 gender [0]='M'; 
		 gender  [1]='M';
		 gender [2]='M'; 
		 gender [3]='M';
		 
		 
		 double rate []= new double [4]; 
		 
			
		 rate [0]=31.5; 
		 rate [1]=25.5;
		 rate [2]=23.7; 
		 rate [3]=40.0;
		
		 System.out.println(name[0]+" "+age[0]+" "+team[0] +" "+dob[0]+" "+gender[0]+" "+gender[0]+" "+rate[0]);
		 System.out.println(name[1]+" "+age[1]+" "+team[1] +" "+dob[1]+" "+gender[1]+" "+gender[1]+" "+rate[1]);
		 System.out.println(name[2]+" "+age[2]+" "+team[2] +" "+dob[2]+" "+gender[2]+" "+gender[2]+" "+rate[2]);
		 System.out.println(name[3]+" "+age[3]+" "+team[3] +" "+dob[3]+" "+gender[3]+" "+gender[3]+" "+rate[3]);
	}

}
