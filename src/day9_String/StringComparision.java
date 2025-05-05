package day9_String;

public class StringComparision {

	public static void main(String[] args) {
		
		//Case-1
		System.out.println("===== Case-1 =====");
		String s1 = "Welcome";
		String s2 = "Welcome";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		//Case-2
		System.out.println("===== Case-2 =====");
		String s3=new String("Welcome");
		String s4=new String("Welcome");
		System.out.println(s3==s4); // Compare two different objects
		System.out.println(s3.equals(s4)); //Compare value of the objects
		
		//Case-3
		System.out.println("===== Case-3 =====");
		String s5 = "Welcome";
		String s6 = new String("Welcome");
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		
	}

}
