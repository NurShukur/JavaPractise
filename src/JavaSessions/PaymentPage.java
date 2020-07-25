package JavaSessions;

public class PaymentPage {

	public static void main(String[] args) {
		
		PaymentPage pp=new PaymentPage (); 
		
		pp.payment("123343242", "5555555");
	
	}

	
	public void payment(String CardNumber, String Password) {
		
		System.out.println(CardNumber+" and "+Password);
		
	}
	

	public void payment(String CardNumber, String Password, int otp) {
		
		
		
	}
	
	public void payment(long UPI, long phoneNumber, int otp) {
		
		
		
	}
	
	public void payment(String PayPalid, String password,String emailId) {
		
		
		
	}
}
