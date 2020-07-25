package OOP_Abstract;

public class HomePage extends Page {

	
	public HomePage () {
		
		System.out.println("Home page constructor ");
	}
	@Override
	void header() {
	
		System.out.println("Hp - header ");
	}

	@Override
	void title() {
		
		System.out.println("HP_tiitle");
		
	}
	
	
	public void userDetails () {
		
		System.out.println("Hp-userDetails");
	}

	
	
}
