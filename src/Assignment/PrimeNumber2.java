package Assignment;

public class PrimeNumber2 {

	public static void main(String[] args) {
		int n = 48;
		int i = 0;

		while (i <= Math.sqrt(n)) {
			i++;
		
		// for(int i=2; i<=Math.sqrt(n);i++){
		if (n % i == 0) {
			System.out.println(n + " Not Prime");
			break;// Exit the Program Early
		} else {
			System.out.println(n + " Prime");
			break;
		}
		}
	

//Approach-2
	int no = 29;
	boolean isPrime = true;	{// Assume the number is prime initially

		for (int k = 2; k <= Math.sqrt(no); k++) {
			if (no % k == 0) {
				isPrime = false; // Set to false if n is divisible by i
				break; // Exit loop early as no need to check further
			}
		}

		if (isPrime) {
			System.out.println(no + " Prime");
		} else {
			System.out.println(no + " Not Prime");
		}

	}
}
}