package JavaSessions;

import java.util.ArrayList;

public class Company {

	public String getCompanyName() {
		
		
		return "IBM";
		
	}

	
	public double getCurrentMarketShareName() {
		
		
		return 12.33;
	
}
	public ArrayList<String> getDepList () {
	
	
	ArrayList <String> depList = new ArrayList <String>(); 
	
	
	depList.add("Admin"); 
	depList.add("HR"); 
	depList.add("Sales"); 
	depList.add("Finance"); 
	depList.add("IT"); 
	
	return depList; 
}
	
	public String[] getBoardOfMembers () {
		
		String boardArr []=new String [3]; 
		boardArr [0]="Tom";
		boardArr [1]="Nur";
		boardArr [2]="Steve";
		
		
		return boardArr ; 
	}
	
	
	public ArrayList <Object> getCompanyInfo() {
		
		
		ArrayList <Object> infoList = new ArrayList <Object> (); 
		
		infoList.add("IBM"); 
		infoList.add("Bangalore"); 
		infoList.add(true);
		infoList.add(100000);
		infoList.add("RFT"); 
		infoList.add(1990); 
		
		
		return infoList; 
		
	}
	
	//create a function where we will pass company name and return total Employees; 
	
	public int  getEmployeeCount(String compName) {
		
		int empCount=0 ; 
		
		 if (compName.equals("IBM")) {
			 
			 empCount=100;  		 	 
		 }
		 else if  (compName.equals("Uber")) {	 
			 empCount=100; 
		 }
		 
		 else if  (compName.equals("TCS")) {	 
			 empCount=90; 
		 }
		 
		 else {
		 
			 System.out.println(compName + "is not found");
		 }
		 
		 return empCount; 
	}


	// create a function where u need to pass the comp name and return list of cofunders; 
	
	public ArrayList <String> getCoufoundersList( String compName ) {
		
	
	ArrayList <String>	founderList=new ArrayList <String>	() ; 
		
	if(compName.equals("Myntra")) {
		
		founderList.add("Nur");

		founderList.add("Shiv Nadar");
	}
	
	else if(compName.equals("HCL")) {
		founderList.add("Tom");

		founderList.add("Ken");

	}


	else if(compName.equals("Google")) {
		founderList.add("Nur");

		founderList.add("Olga");

}
		
	else {
		
		
		System.out.println(compName+ "Not Founded");
		
	}
		
		return founderList; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
