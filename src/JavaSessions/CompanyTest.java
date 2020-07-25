package JavaSessions;

import java.util.ArrayList;

public class CompanyTest {

	public static void main(String[] args) {
		
		
		Company comp= new Company(); 
		
		String name=comp.getCompanyName(); 
		
		ArrayList <String> CoFounders=comp.getCoufoundersList("Google");
		
		
		System.out.println(name);

		System.out.println(CoFounders);
		
		
		ArrayList <String> deptList=comp.getDepList(); 
		
		for (String d :deptList) {
			
			System.out.println(d);
		}
		
		String [] BOM= comp.getBoardOfMembers(); 
		
		System.out.println(BOM.length);
		
		ArrayList <Object> compList = comp.getCompanyInfo();
		
		System.out.println(compList);
		
	}

}
