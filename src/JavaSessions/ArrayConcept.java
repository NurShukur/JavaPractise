package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {

		//1.Static array : 
		
		//we use Static array when we have static type of data. 
		//two major limitations of array:
		
		//size fixed
		//can store only similar types of data . 
		
		//
		
		//2. Dynamic Array : where size is dynamic.  Array list or any collection in JAva. 
		//1.int array : 
		
		int i[]= new int [4]; // data type +arg+ square bracket =new 
		
		i [0]=10;
		i[1]=20 ; 
		i[2]=30; 
		i[3]=40; 
		
		System.out.println(i[0]);
		
		System.out.println(i[0]+i[1]);
		
		System.out.println(i.length);
		
		//System.out.println(i[-1]); // ArrayindexOutofboundException
		
		//highest index = i.length-1
		
		//print all the variable of Array : ALways use FOR LOOP to print; 
		
		for (int k=0 ; k<i.length; k++) {  // do not put = after i.length 
			
			System.out.println(i[k]);
		}
			
			//2.double array
		//double and  can store int value but int can not store double or float
		double d[]=new double [2]; 
		 d[0]=12.33; 
		 d[1]=13.44; 
		 
		//3 char array :
		 
		 char c[]=new char [3]; 
		 
		 c[0] = 'a'; 
		 c[1] = 'b'; 
		 c[2] = '$'; 
		 
		 System.out.println(c[0]+c[1]); /// SUm of ASCII codes
		

		 String s[]=new String [3]; 
		 
		 s[0]="Java"; 
		 s[1]="Python"; 
		 s[2]="Ruby"; 
		 
		 for (int l=0; l<s.length;l++) 
			 
		 {
			 
			 System.out.println(s[l]);
		 }
		 
		 //5.boolean array: 
		 
		 boolean b [] =new boolean [2]; 
		 
		 
		 //Object Array: 
		 
		 Object ob[]=new Object[5];  // different types of values can store. 
		 
		 ob [0]="Tom"; 
		 ob [1]=25; 
		 ob [2]='m'; 
		 ob[3]=34.44; 
		 ob[4]=false; 
		 
		 for (int u=0; u<ob.length;u++) {
			 
			 
			 System.out.println(ob[u]);
		 
		 
		 
		 
		 int t []=new int[10];
		 
		 t[0]=10; 
		 t[1]=20 ; 
		 t[2]=30; 
		
		 System.out.println(t[3]); // if you print an index , 
		 //if nobody lives there will print default value of int which is 0 zero ; 
		 
		 
		
		 
		 String str[]=new String[5]; 
		 
		 str[0]="test"; 
		 
		
		 System.out.println(str[1]);
		 
				 
		 }
		 
	}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}


