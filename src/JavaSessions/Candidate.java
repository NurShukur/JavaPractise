package JavaSessions;

public class Candidate {
	
	// Reference transfer 
	//Shifting references or Mapping of references
	
	// you always check current reference position
	
	
	String name ; 
	int age; 
	String location ; 
	
	// Generate Constructor with source
	public Candidate(String name, int age, String location) {
		this.name = name;
		this.age = age;
		this.location = location;
	}



	public static void main(String[] args) {
		
		Candidate a=new Candidate("Kan",25,"NY"); 
		Candidate b=new Candidate("Sheena",45,"LA"); 
		Candidate c=new Candidate("ANusha",35,"Banglore"); 

		
		System.out.println(a.name+" " + a.age+ " " + a.location);
		System.out.println(b.name+" " + b.age+ " " + b.location);
		System.out.println(c.name+" " + c.age+ " " + c.location);
		
		a=b; 
		
		System.out.println(a.name+" " + a.age+ " " + a.location);
		System.out.println(b.name+" " + b.age+ " " + b.location);
		System.out.println(c.name+" " + c.age+ " " + c.location);
		
		b=c;
		
//		Sheena 45 LA
//		Sheena 45 LA
//		ANusha 35 Banglore
		
		System.out.println(a.name+" " + a.age+ " " + a.location);
		System.out.println(b.name+" " + b.age+ " " + b.location);
		System.out.println(c.name+" " + c.age+ " " + c.location);
		
//		Sheena 45 LA
//		ANusha 35 Banglore
//		ANusha 35 Banglore

		c=a; 
		System.out.println(a.name+" " + a.age+ " " + a.location);
		System.out.println(b.name+" " + b.age+ " " + b.location);
		System.out.println(c.name+" " + c.age+ " " + c.location);
		
//		Sheena 45 LA
//		ANusha 35 Banglore
//		Sheena 45 LA
		
		
	}

}
