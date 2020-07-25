package JavaSessions;

public class IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	// WAP where we have three numbers ---->> find out the highest number 
		
		int x = 100 ; 
		int y = 200 ; 
		int z= 150 ; 
		
		//&& short  circuit operator 
		if (x>y && x>z) {
			
			System.out.println("X is the highest number");
			
			
		}
		
		else if  (y>z) {
			
			System.out.println("y is the highest number");
		}
			
		else {
				
				System.out.println("z is the highest number");
			}
		
		
		
		
		//Switch-case :  Control+Space over the switch
		
		int point =3 ; 
		
		switch (point) {
		case 0:
			
			
		System.out.println("point is zero");
			break;
	
		case 1:
			
			System.out.println("point is one");
				break;
		case 2:
			
			
			System.out.println("point is two");
				break;
		case 3:
			
			
			System.out.println("point is three");
				break;
		default:
			
			System.out.println("this point not found ....");
			break;
		}
		
		
		
		
		String browserName = "chrome"; 
		
		switch (browserName) {
		case "chrome":
				
			System.out.println("launch chrome");
			
			break;
			
		case "firefox":
			
			System.out.println("launch  firefox");
			
			break;
			
		case "ie:":
			
			System.out.println("launch ie");
			
			break;

		default:
			
			System.out.println("Please pass correct broweser name" +browserName);
			break;
		}
		
		
		}
	}






