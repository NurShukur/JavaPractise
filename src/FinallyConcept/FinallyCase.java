package FinallyConcept;

public class FinallyCase {
	
	
	public static int getMarks(String name) {

		if (name.equals("Tom")) {

			return 100;
		}

		else if (name.equals("steve")) {

			return 50;
		} else {
			return -1;
		}

	}
	

	public static void main(String[] args) {
	
		
		System.out.println(getMarks.("Tom"));

	}

}
