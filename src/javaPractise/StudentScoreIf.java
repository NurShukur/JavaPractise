package javaPractise;

import java.lang.invoke.SwitchPoint;

public class StudentScoreIf {

	public static void main(String[] args) {
	
		
		/*
		 * 3. Maintain one Student name and do the following conditions: Please maintain
		 * a score number variable here. if student name is "Virat" then score is 100 if
		 * student name is "Smith" then score is 90 if student name is "Sachin" then
		 * score is 200 if student name is "Werner" then print this player is not found
		 */
		
		String  a="Virat"; 
		
		if (a=="Virat") {
			
			System.out.println("Your score is 100");
			
		}
			else  if (a=="Smith") {
				
				
			System.out.println("Your score is 90");
		}
		
			else  if (a=="Sachin") {
				
				
				System.out.println("Your score is 200");
			}
		
		
			else {
				
				System.out.println("this player not found");
			}
		}	

}
