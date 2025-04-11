package Assignment;

import java.util.Scanner;

public class PrimeNumber4 {

	public static void main(String...args) // Using varargs (equivalent to String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
//Declaring variables
		int n = sc.nextInt();
		boolean isPrime;
		int count = 0;
//Declaring Array Variable
		int[] a = new int[n];
		for (int i = 1; i < a.length; i++) {
//Assign value to array
			a[i] = i + 1;

		}
// Check each number for primality
		for (int num : a) {
			if (num <= 1)
				continue; // 1 is not a prime number

			isPrime = true;
			for (int k = 2; k <= Math.sqrt(num); k++) {
				if (num % k == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(num);
				count++;
			}

		}
		System.out.println("Total Prime Numbers are : " + count);
		sc.close();
	}

}
