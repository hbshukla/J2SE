package Assignment;

import java.util.Scanner;

public class Temp {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Number");
	int n= sc.nextInt();
	int count = 0;
		
	for(int i=2; i<=n; i++)
	{
		if (isPrime(i)) {
			System.out.println(i);
			count++;	
		}
		
	}
	System.out.println("Total Prime Numbers are : "+ count);
sc.close();
	}
	private static boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
			if (number < 2) {
				continue;
			}
		}
		return true;

	
	
}
}
