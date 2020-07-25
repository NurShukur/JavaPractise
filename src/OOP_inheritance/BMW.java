package OOP_inheritance;


	// extend key words make child 
	public class BMW extends Car  {
	
	@Override	// this help us to check Overriding 
	public void start () {
	System.out.println("BMW --- start");
	}
	
	public void autoParking() {
		System.out.println("BMW autoPArking");
	}
}


