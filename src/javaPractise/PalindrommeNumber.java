package javaPractise;

public class PalindrommeNumber {
	

	public static void main(String[] args) {
		
		int num=2441; 
		
		int temp=num; 
		
		int sum=0; 
		int r = 0; 
		
		while (num>0) {
			
			r=num%10; 
			num=num/10; 
			sum=sum*10 +r ; 
			
			
			
		}
		
		System.out.println(temp);
		if(temp==sum) {
			
			System.out.println(" Pollindromdur ");
			
		}
	
		else {
			
			System.out.println("Pallindrom deyil");
		}
	}

}
