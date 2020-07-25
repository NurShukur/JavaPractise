package OOP_Interface;

public class FortisHospital implements USMedical,UKMedical,IndianMedical{

	// US Medical
	@Override
	public void orthoServices() {
	
		System.out.println("FH-orthoServices");
	}

	@Override
	public void neuroServices() {
		
		System.out.println("FH-neuroServices ");
	}

	@Override
	public void physioServices() {
		
		System.out.println("FH-physioServices");
	}
	// UK Medical

	@Override
	public void pediaServices() {
	
		System.out.println("FH- pediaServices");
	}

	@Override
	public void oncologyServices() {
	
		System.out.println("FH- oncologyServices");
	}
	

	@Override
	public void cardioServices() {
	
		System.out.println("FH- cardioServices");
	}
	
	@Override
	public void ENTServices() {
	
		System.out.println("FH- ENTServices");
	}

	@Override
	public void Services_911() {
		
		System.out.println("FH - 911 Services");
		
	}
	
	// FH methods ( individual methods) Non overridden methods 
	public void  OPDServices  () {
		
		System.out.println("FH -OPDServices ");
	}
		
	public void medicalInsurance  () {
		
		System.out.println("FH -medicalInsurance ");
			
	}
	
	@Override
	public void billing () {
		
		System.out.println("FH - billing");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}


