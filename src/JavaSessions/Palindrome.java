package JavaSessions;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		
		System.out.println("Please enter your string : ");
		Scanner sn=new Scanner (System.in) ; 
		sn.nextLine(); 
		
		
		
		String reversed="";
		
		
		
		
	
		for (int i=s.length()-1;i>=0; i--) {
			
			
			reversed=reversed+charAt(i); 
			
		
			
		}
		
		if (s.equalsIgnoreCase(reversed)) {
			System.out.println("Your string is polindrom: " + reversed);
		}
		else {
			System.out.println("Your string is not polindrom: " + reversed);
		}
		
	}

}
