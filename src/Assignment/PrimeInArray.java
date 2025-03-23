package Assignment;

public class PrimeInArray {

	public static void main(String[] args) {

//Declaring array with values
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };

		/*-----------------------------------------------------------------------------------
		 * Array of Primitives (int[]): When you declare an array of primitives like
		 * int[] a = {1, 2, 3, 4};, the array holds the actual integer values (1, 2, 3,
		 * 4), not references to Integer objects. So, the values 1, 2, 3, and 4 are 
		 * primitive int values, not objects...
		 *----------------------------------------------------------------------------------*/

// for (int i = 0; i <= a.length - 1; i++) //This is also valid

		for (int x : a) { // in Outer loop, Storing array value to "x" variable
			boolean isPrime = true;

// Check if the number is divisible by any number between 2 and x or a[i] - 1
			// for (int k = 2; k <= Math.sqrt(a[i]); k++) //This is also valid
			for (int k = 2; k <= Math.sqrt(x); k++) // in Inner loop - k is the divisor which loops upto Math.sqrt(x)
			{
				// if (a[i] % k == 0) // This is also valid
				if (x % k == 0) {
					isPrime = false;
					break;
				}
			}
// If the number is prime, print it
			if (isPrime) {
				// System.out.println(a[i]);
				System.out.println(x);
			}
		}

	}

}
