package javaPractise;

import java.lang.invoke.SwitchPoint;

public class StudentScoreSwitch {

	public static void main(String[] args) {
	
		
		/*
		 * 3. Maintain one Student name and do the following conditions: Please maintain
		 * a score number variable here. if student name is "Virat" then score is 100 if
		 * student name is "Smith" then score is 90 if student name is "Sachin" then
		 * score is 200 if student name is "Werner" then print this player is not found
		 */
		
		
		String name ="Nurlan"; 
		
		switch (name) {
		case "Virat":
			
			System.out.println("Your Score is 100");
			break;
			
		case "Smith":
			
			System.out.println("Your Score is 90");
			break;	

		case "Werner":
			
			System.out.println("Your Score is 200");
			break;	
		default:
			
			System.out.println("this player is not found");
			break;
		}	}

}
