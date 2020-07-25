package OOP_inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		//Method overridding is when I do not want to use Parent method
		//When you have method in paremtn class with same name and same number of params and the same method child 
		//method signature should be exactly same with same params, same return type 
	
		BMW b=new BMW (); 
		
		
		b.start(); 			//ovverridden method 
		
		b.stop();			 //inherited method 
		
		b.refuel();			// inherited method
		
		b.autoParking(); // child class method 
		
		
		
		System.out.println("_______");
		
		Car c =new Car (); 
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("_______");
		
		//Top casting :
		Car c1=new BMW(); // Child class object can be reffered by parent class ref variable ; 
		
		c1.start();
		c1.stop();
		c1.stop();
		//c1.autoaParking  will not have access because Reference type check does not allow security reason. 
		
		//My Father can not use my name. 
		BMW c2=(BMW) new Car();   // runtime Exception  java.lang.ClassCastException:
		
		Vehicle c3=new BMW();   // runtime Exception  java.lang.ClassCastException:
		
	}

}
