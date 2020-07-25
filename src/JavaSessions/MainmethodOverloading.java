package JavaSessions;

public class MainmethodOverloading {

	public static void main(String[] args) {
		
		//we do not need create object that is why main method is static .JVM reach directly to main method
		
		System.out.println("THis is main method ");
		
		main(10);
		
		main (10,20);
	}
	
	public static void main(int i) {
	
		System.out.println(i);
	}

	
	public static void main(int i,int j) {
		
		System.out.println(i+j);
	}
}
