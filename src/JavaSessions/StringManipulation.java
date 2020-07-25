package JavaSessions;

public class StringManipulation {

	public static void main(String[] args) {

		// String is Collection of characters
		// Space is also character
		String str = "Hi this is my java code and I am so happy";

		System.out.println(str.length());// 40

		System.out.println(str.trim());

		System.out.println(str.charAt(40));// y
		// System.out.println(str.charAt(41));//StringIndexOutOfBoundsException

		System.out.println(str.indexOf('m'));

		System.out.println(str.indexOf('s')); // first S on the String 1st occurence of 's' .

		// Give me the second 's' character

		// System.out.println(str.indexOf('s', 32)); // 2.nd occurence of 's'

		System.out.println(str.indexOf('s', (str.indexOf('s') + 1)));
		System.out.println(str.indexOf('s', str.indexOf('s', (str.indexOf('s') + 1)) + 1)); // home assignment 3rd
																							// occurence of 's'

		System.out.println(str.indexOf("java"));

		String mesg = "Welcome Admin";

		if (mesg.indexOf("Admin") > 0) {

			System.out.println("admin username is present...");

		}

		else {

			System.out.println("Admin username is not present...");
		}

		System.out.println(str.indexOf("Naveen")); // Iif string not available will give -1 ;

		// trim:

		String t1 = "  hello world ";
		System.out.println(t1.trim());// this method will remove before and after words .

		// uppercase :

		String test = "welcome Selenium";

		System.out.println(test.toUpperCase());

		// lowercase :

		System.out.println(test.toLowerCase());

		// Replace :

		String dob = "1-1-1990 ";

		System.out.println(dob.replace('-', '/'));

		String t2 = "  welcome    testing    ";

		System.out.println(t2.trim().replace(" ", ""));

		System.out.println(t2.replace(" ", ""));

		// contains :

		String message = "Welcome admin user";

		String actual = "admin";

		System.out.println(message.contains("Admin"));

		if (message.contains("admin")) {

			System.out.println("admin is present ...");
		}

		// string comparison:

		String p1 = "hello this java here";
		String p2 = "hello this Java here";

		System.out.println(p1.equals(p2));
		System.out.println(p1.equalsIgnoreCase(p2));// will ignore only cases . length must be same.

		// subString:

		String longmesg = "hi this is my automation code";

		System.out.println(longmesg.substring(0, 7)); // hi this

		String confirmMesg = "your order number is 12345";

		System.out.println(confirmMesg.substring(confirmMesg.indexOf("is") + 3, confirmMesg.length()));

		System.out.println(confirmMesg.substring(confirmMesg.indexOf("is") + 3, confirmMesg.lastIndexOf(""))); // assignments

		System.out.println(confirmMesg.substring(5));

		String p3 = "this is selenium code";

		System.out.println(p3.substring(5));

		// split :

		String lang = "Java-Python-Ruby-JavaScrirpt";

		String langArr[] = lang.split("-");

		// System.out.println(langArr[0]);

		for (int i = 0; i < langArr.length; i++) {

			System.out.println(langArr[i]);
		}

		String h1 = "xXAnushaxXRufatxXSheena";

		String h2[] = h1.split("xX");

		String student = h2[3];

		System.out.println(h2[1]);
		System.out.println(h2[2]);
		System.out.println(h2[3]);
		System.out.println(student);

		String empData = "Kan;Oberoi;30;SFO;CA;IBM;909090";

		System.out.println(empData); // we need seperate

		for (int i = 0; i < empData.split(";").length; i++) {

			System.out.println(empData.split(";")[i]); // empData.split(";") is our Array
		}

//		 String fn =empData.split(";")[0];
//		 String ln =empData.split(";")[1];
//		 String age =empData.split(";")[2];
//		 String city =empData.split(";")[3];
//		 String state =empData.split(";")[4];
//		 String comp =empData.split(";")[5];
//		 String phone =empData.split(";")[6];
//
//		 
//		 System.out.println(fn);
//		 System.out.println(city);

	}


}
