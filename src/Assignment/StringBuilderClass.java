package Assignment;

import java.util.Scanner;

public class StringBuilderClass {

	public static void main(String[] args) {
		//Using String Builder Class
		Scanner sc=new Scanner(System.in); //creates a scanner object to read input.
		System.out.println("Enter Number : ");
		int num=sc.nextInt();//reads the integer entered by the user and stores it in the variable num.
		
		StringBuilder sb=new StringBuilder(); // This creates a new StringBuilder instance with no initial content.
		sb.append(num); //This adds the string "num" to the StringBuilder.
		StringBuilder rev=sb.reverse();
		System.out.println("Reverse Number is : "+ rev);
		sc.close();
	}
	
}
