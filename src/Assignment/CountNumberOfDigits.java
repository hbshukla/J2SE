package Assignment;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number : ");

		int num = sc.nextInt();

		int count = 0;

		while (num != 0) {
			num = num / 10;
			count++;
		sc.close();
		}
		System.out.println("Total Digits of Number(s) is/are : " + count);

	}

}
