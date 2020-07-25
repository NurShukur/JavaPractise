package ExceptionHandling;

public class Throwskeyword {

	public static void main(String[] args) {

		Throwskeyword obj = new Throwskeyword();

		try {
			obj.getValue();
		}

		catch (ArithmeticException e) {
			e.printStackTrace();

		}
		System.out.println("Exception got ");
	}
	
	           public void getValue() throws  ArithmeticException{	
		
		System.out.println("get value");
		
		getNumber (); 
			
		}
		
	public void getNumber() throws ArithmeticException {
		
		System.out.println("getNumber");
		getName(); 
	}

	public void getName()throws ArithmeticException{	
		System.out.println("getName");
		int i=9/0;
	}

	}

//main method called by JVM 

