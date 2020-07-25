package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh= new FortisHospital(); 
		
		 fh.cardioServices();
		 fh.neuroServices();
		 fh.Services_911();
		 fh.physioServices();
		 fh.OPDServices();
		 fh.medicalInsurance();
		
		
		//1.top casting : 
		 
		 //child class object can be reffered by parent interface ref variable ; 
		 
		 USMedical us=new FortisHospital (); 
		 
		 //Webdriver driver = new Chrome Driver () ; 
		 
		 us.orthoServices();
		 us.neuroServices();
		 us.Services_911();
		 
		// Reference type check apply here and does not allow take other interface methods except US. 
		// we can only access those methods which comes from US. 
		 
		 UKMedical uk=new FortisHospital (); 
		 
		 uk.pediaServices();
		 uk.physioServices();
		 
		 //USMedical.min_fee=50 ;  The final field USMedical.min_fee cannot be assigned. 
		 System.out.println(USMedical.min_fee);
		 
		 USMedical.display(); // static method can called by class or interface method 
		 
		 fh.billing();
		 
	
		 
		 
		
	}

}
