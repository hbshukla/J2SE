package Assignment;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// Approach1
		System.out.println("Approach-1 : Number is already feeded in the code");
		int N = 789524;
		int sum = 0;
		int remainder = 0;
		while (N != 0) {
			remainder = N % 10;
			sum = sum + remainder;

			N = N / 10;
		}
		System.out.println("Sum of given number is : " + sum);
		System.out.println();
		System.out.println("Approach-2 : Enter Number By User");

		// Approach2
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Number :");
		// int number = sc.nextInt();
		long number = sc.nextLong();// Use nextLong for larger numbers

		// Check if number is more than 9 digits
		if (number > 999999999l) {
			System.out.println("Please Re-run the Program and Enter upto 9 digits only, Thank you.  ");
		} else {
			int sum1 = 0;
			int remainder1 = 0;
			while (number != 0) {
				remainder1 = (int) (number % 10); // Get the last digit
				sum1 = sum1 + remainder1;

				number = number / 10;// Remove the last digit
			}
			System.out.println("Sum of the Digits : " + sum1);
		}
		sc.close(); // Close the Scanner
	}

}
