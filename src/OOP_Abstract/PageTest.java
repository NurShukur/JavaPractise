package OOP_Abstract;

public class PageTest {

	public static void main(String[] args) {
	
		HomePage hp = new HomePage () ; 
		
		hp.title();
		hp.header();
		hp .userDetails();
		hp.footer(); // not overridden
		
		//Page p= new Page (); we can not create object of abstract method
	
	
		
		//1.top casting
		Page p=new HomePage (); 
		
		p.footer();
		p.header();
	
	}

}
