package Assignment;

import java.util.Scanner;

public class StringBuilderClass1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int i = sc.nextInt();

//Approach-1
/*The StringBuilder constructor does not accept an integer directly in Java. 
You should convert the integer to a string first, then pass that string to the StringBuilder constructor.*/
// Convert the integer to a string
        String str = Integer.toString(i); //convert the integer to a string first
		StringBuilder sb= new StringBuilder(str);
		StringBuilder rev = sb.reverse();
		System.out.println(rev+"\n"); //"\n" will add new empty line

//Approach-2
		StringBuilder sb1= new StringBuilder();
		sb1.append(i);
		StringBuilder rev1 = sb1.reverse();
		System.out.println(rev1);
	sc.close();
	}
}