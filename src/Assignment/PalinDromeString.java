package Assignment;

public class PalinDromeString {

	public static void main(String[] args) {

		String s = "madama";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (s.endsWith(rev)) {
			System.out.println("Original String is :"+s);
			System.out.println("Reverse String is : " + rev);
			System.out.println("String is Palindrome");
		} else {
			System.out.println("Original String is :"+s);
			System.out.println("Reverse String is : " + rev);
			System.out.println("It is not Palindrome");
		}

	}

}
