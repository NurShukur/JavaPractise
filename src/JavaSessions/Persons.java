package JavaSessions;

public class Persons {

	String name;
	int age; 
	long phone; 
	
	//Constructor name is same with class name . 
	//Constructor will not return any value. 
	//inside will never write return;
//	public Persons() {  									// 0 parameter or default constructor
//			
//		
//		System.out.println("my default const");
//	}
//	
//	public Persons(int i) { 							//1 parametr constructor ...overloading cosntructor
//		
//		System.out.println("1 parametrs ");

	


	//Class is a template to create objects
	// Constructor helps us saving time 


 	public Persons (String name,int age,long phone) {
 		this.name=name; 
 		this.age=age;
 		this.phone=phone; 
 		
 	}
 	
 	public Persons (String name) {  //overloading constructor 
 		this.name=name; 
 		
 	}
 	
	public Persons (String name,int age) {  //overloading constructor 
 		this.name=name; 
 		this.age=age;
 		
 	}
	
	public static void main(String[] args) {
		
		//call constructor  create the object : 
		
		//Persons p1=new Persons(10);   //Java checks ();;
				
		Persons p1=new Persons("Tom",26,909090);
		Persons p2=new Persons("Kan",25,1323232);
		Persons p3=new Persons("Nur",27,7221213);
		Persons p4=new Persons("Naveen",30);
		
		 System.out.println(p1.name+ " "+p1.age+" "+p1.phone);
		 System.out.println(p2.name+ " "+p2.age+" "+p3.phone);
	     System.out.println(p3.name+ " "+p3.age+" "+p3.phone);
	     System.out.println(p4.name+ " "+p4.age+" "+p4.phone);
	}
	
	

	
	
	
}
