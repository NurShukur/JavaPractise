package JavaSessions;

public class NullReference {

	String name ; 
	int age; 
	
	
	
	public NullReference(String name, int age) {
	
		this.name = name;
		this.age = age;
	}



	public static void main(String[] args) {
		
		//You have not create object you create only reference then yiou will get NullPointerException
//		NullReference n1=new NullReference("Tom",25); 
//		
//		//n1=null;  //NullPointerException
//		
//		System.out.println(n1.name);
//		System.out.println(n1.age);
		
		NullReference n1=null;   //NullPointerException
		System.out.println(n1.name);
		
		
	}

}
