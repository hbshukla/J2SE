package day8_String;

public class StringMethods {

	public static void main(String[] args) {
		
		String s = "Welcome";
		String s1 = "To Java";
		String s2 = "Automation";
		
		System.out.println(s.length());
		System.out.println("Concat of S & S1 : "+s+" "+s1);
		System.out.println(s.concat(s1).concat(s2));
		
		String s3 = "Welcome   ";
		System.out.println(s3);
		
		//trim
		System.out.println(s3.trim());
		System.out.println(s3.trim().length());
		
		//charAt - index start from
		System.out.println(s3.charAt(0));
		
		//contains() - returns true /false
		System.out.println(s3.contains(s));
		
		//equals(), equalsIgnoreCase() - Compare String
		String s4 = "Welcome";
		
		System.out.println("===== equals(), equalsIgnoreCase() - Compare String =====");
		System.out.println(s==s4); // True
		System.out.println(s.equals(s4)); // True
		System.out.println(s.equals("welcome")); //False
				
	}

}
