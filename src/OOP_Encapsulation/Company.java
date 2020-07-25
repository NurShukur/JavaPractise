package OOP_Encapsulation;

public class Company {
	
	
	public String name;
	public long totalEmployee; 
	public String hqCity; 
	private String policy ; // confidential 
	//private variable can not be accessed from outside of class template
	
	//Encapsulation is You create private method 
	// we create it two purposes: 
	//-Security reason .
	//- We create wrapper we hide unnecessary methods from user .Not bother user 

	
	public void getCompanyAdress () {
		
		System.out.println("get Company Name");
		
	}
	
	public void getEmpInfo () {
		
		getEmpSalary ();
	} 
	private void getEmpSalary () {
		
		System.out.println("salary");
	}
	public static void main(String[] args) {
		
		Company c1 =new Company(); 
		c1.name="IBM"; 
		c1.policy="HR Rules" ;
		
		c1.getCompanyAdress();
	
		
	}

}
