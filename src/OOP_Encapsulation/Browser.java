package OOP_Encapsulation;

public class Browser {

	public void launchBrowser () {
		
		System.out.println("checking the browser ....");
		
		checkBrowserVersion ();
	}
	
	private void checkBrowserVersion () {
		
		 OSCompatible () ;
		 System.out.println("Browser Version");
	}
	
	private void OSCompatible () {
		
		CPUMemoryForBrowser () ;
		
		System.out.println("OS Compatible");
	}
	private void CPUMemoryForBrowser () {
	
		latesUpdatesforBrowser () ;
		
		System.out.println("CPU");
}

	private void latesUpdatesforBrowser () {
	
		System.out.println("latest Updates");
}
}
