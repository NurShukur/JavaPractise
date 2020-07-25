package JavaSessions;

public class FunctionsInJava {

	public static void main(String[] args) {    
		
		FunctionsInJava obj=new FunctionsInJava(); 
		
		obj.test();
		
		String n1=obj.getTrainerName();
		
		
		System.out.println(n1);
		
		System.out.println(obj.getTrainerName());
		
		
		int total=obj.getTotalMethod(); 
		
		
		System.out.println(total);
		System.out.println(obj.getTotalMethod());
		
		System.out.println(obj.addition(2, 3));
		
		System.out.println(obj.addition(40, 50));
	}

	// three types of methods we can create :
	
	//1.simple methods : does not return anything and does not take any parameter: 
	
	//void type : 
	//no ip and np op : no return  keyword : void : does not retunr anything ...

	public  void test() {
		
		System.out.println("test method ....");
	}
	
	
	// 2.no input bu some return : 
	 
	
	// return type : String 
	public String getTrainerName() {
		
		System.out.println("get trainer name ...");

		String name = "Naveen" ; 
		
		return name;//  return is last statement of the function/method 
	}
	
	//return type : int 
	public int getTotalMethod () {
		
		
		System.out.println("getTotal ... ");
		
		int a = 100; 
		
		int b = 200 ; 
		
		int total = a+b; 
		
		return total ; 
	}
	
	//3.some input and some return : 
	
	public int addition (int a,int b) {
		
		
		int total = a+b; 
		
		return total ; 
		
	}
	
	//return boolean 
	
	public boolean isUsCitizen(String name) {

			boolean  flag=false; 
		if(name.equals("Naveen")) {
		
		
		
	}
		
		else if (name.equals("Nurlan")) {
		
			return true ; 
		
	}
		
		else if (name.equals("Bashir")) {
			

		
	}
	
		return flag; 
	}
	
	public int getStudentMArks(String name) {
		
		int marks=-1 ; 
		
		if (name.equals("Shivangi")) {
			
			marks= 100; 
			
		}
		
		if (name.equals("Sudha")) {
			
			marks= 95; 
			
		}
		
		if (name.equals("Naveen")) {
			
			marks=10; 
			
		}
		
		return marks; 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
