package day8_String;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		String s = "Welcome";
		String s1 = "To Java";
		String s2 = "Automation";
		
		System.out.println(s.length());
		System.out.println("Concat of S & S1 : "+s+" "+s1);
		System.out.println(s.concat(s1).concat(s2));
		
		String s3 = "WelcomE   ";
		System.out.println(s3);
		
		//trim
		System.out.println(s3.trim());
		System.out.println(s3.trim().length());
		
		//charAt - index start from
		System.out.println(s3.charAt(0));
		
		//contains() - returns true /false
		System.out.println(s3.contains(s));
		
				
		//equals(), equalsIgnoreCase() - Compare String
		String s4 = "WelCOme";
		
		System.out.println("===== equals() - Compare String =====");
		System.out.println(s==s4); // True
		System.out.println(s.equals(s4)); // True
		System.out.println(s.equals("welcome")); //False
		System.out.println("===== equalsIgnoreCase() - Compare String =====");
		System.out.println(s.equalsIgnoreCase(s4));
		
		//replace() - replace single/multiple (Sequence) of characters in a String
		System.out.println();
		System.out.println("===replace() - replace single/multiple (Sequence) of characters in a String===");
		String s5="Welcome to Selenium java , Selenium Python , Selenium C#";
		System.out.println(s5.replace("e", "X"));
		System.out.println(s5.replace('e', 'X'));
		
		
		//substring
		System.out.println("===== SubString =====");
		System.out.println(s4.substring(1,4));
		
		
		//toUpperCase toLowerCase
		System.out.println("===== UpperCase - LowerCase");
		String h = "hemant";
		String h1 = "HARSHAL";		
		System.out.println(h.toUpperCase());
		System.out.println(h1.toLowerCase());
		
		//split
		System.out.println("=== Split ===");
		String email = "abc@gmail.com";
		String []a=email.split("@");
		int []i= {1,2,3,4,5,6,7,8,9,10};
		for(String e:a)
		System.out.println(e);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(i));
		
		System.out.println("===Replace $15,20,55 to amount==");
		String amount = "$15,20,55";
		System.out.println(amount.replace("$","").replace(",",""));
		
		//consider name without using equalsIgnoreCase()
		System.out.println("===consider name without using equalsIgnoreCase()===");
		String name="Hemant Shukla";
		System.out.println(name.contains("hemant"));
		System.out.println(name.replace('H','h').contains("hemant"));
		System.out.println(name.toLowerCase().contains("hemant"));
		
		
	}
	

}
