package JavaSessions;

public class User {
	
	//data members: 
	
	//1.class variables ; 
	//2.class methods.
	
		
	
	String name; 
	int age; 
	String email  ;
	
	public void getName () {
			
			
			System.out.println("get name method");
			
			
			
		}
		
		public static void main(String[] args) {
		
			//for using class data members we need to create the onbject of the class:
			
			User user1=new User(); 
		
			user1.name="Sheetal"; 
			user1.age=25; 
			user1.email="shetal@gmai.com";
			
			
			User user2 =new User(); 
			
			user2.name="Nurlan";
			
			user2.age=25;
			user2.email="Nur@gmail.com";
	
			user1.getName(); // print inside of method
			
			System.out.println(user1.name+" "+user1.age+" "+user1.email);
			System.out.println(user2.name+" "+user2.age+" "+user2.email);
				
			User user4=new User(); 
			
			System.out.println(user4.name+" "+user4.age+" "+user4.email);  // default values
			
			
				
		}
	}


