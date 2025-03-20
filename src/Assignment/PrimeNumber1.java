package Assignment;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int n = sc.nextInt();

		boolean isPrime = true;

		//for (int i = 2; i < n; i++) // This is also valid

/*Checking up to sqrt(n) reduces the number of checks
Using sqrt(n) makes your prime-checking algorithm much more efficient. 
You don’t check numbers beyond sqrt(n) because you’ll already have found all divisors up to that point.*/
		
		for (int i = 2; i <= Math.sqrt(n);i++) // This is also valid as it optimize the   
			if (n % i == 0) {
				isPrime = false;
				break;
			}

		if (isPrime) {
			System.out.println("Prime Number");
			// count++;
		} else {
			System.out.println("NOT Prime Number");
		}
		sc.close();
	}
//System.out.println("Total Prime Numbers are : "+ count);

}
