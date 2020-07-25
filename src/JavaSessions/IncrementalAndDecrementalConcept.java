package JavaSessions;

public class IncrementalAndDecrementalConcept {

	public static void main(String[] args) {
		
		//++ ----> increase by 1 
		//-- -----> increase by 1 
		
		int a = 1; 
		int b =a++; 
		System.out.println(a); //2
		System.out.println(b); //1
		
		int h = -4; 
		int g=h++; 
		
		System.out.println(h);  //-3
		System.out.println(g); // -4
		
		
		
		int p = 2;  
		
		int q=++p; 
		
		System.out.println(p); //2
		System.out.println(q);//2
		
		int m =2;       //  1
		int n = m--;   // 2
		
		System.out.println(m);
		
		System.out.println(n);
		
		int c=70;  // -4
		int d=--c;  // -4
		
		System.out.println(c); 
		System.out.println(d);
}
}


