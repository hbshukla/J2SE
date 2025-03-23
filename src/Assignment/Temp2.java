package Assignment;

import java.util.Scanner;

public class Temp2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");

        // Declaring variables
        int n = sc.nextInt();
        int count = 0;

        // Iterate through each number from 2 to n to check for primality
        for (int num = 2; num <= n; num++) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
        }

        // Output the total count of prime numbers
        System.out.println("Total Prime Numbers are: " + count);
        sc.close();
    }

     //Method to check if a number is prime
    private static boolean isPrime(int number) {
    	for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible, it's not a prime number
            }
    	if (number <= 1) {
            return false; // Numbers less than 2 are not prime
        }

        // Check divisibility from 2 to sqrt(num)
        
        }

        return true; // If no divisors were found, it's a prime
    }
}

/*Passing the Value:
When you call isPrime(num), the value of num (let's say num = 2 in the first loop) is passed 
to the method isPrime. In Java, when a method is called, the actual argument (in this case, num) is copied 
into the formal parameter (in this case, number).
This is called pass-by-value, which means that the value of num is passed to the method, 
not the variable itself. Inside the method, number will hold the same value as num at the time of the call,
but number is a separate local variable inside the isPrime method.*/
