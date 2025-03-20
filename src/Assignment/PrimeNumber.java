package Assignment;

//import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {

//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Number :");
//		int n = sc.nextInt();
//		
int count=0;
		for (int n = 2; n <= 100; n++) {
			boolean isPrime = true;
			for (int i = 2; i < n ; i++) {

				if (n % i == 0) {
					isPrime = false;
					break;
				}

			}
			if (isPrime) {
				System.out.println(n);
				count++;
			}
		}
System.out.println("Total Prime Numbers between 2 to 100 are : "+ count);
		// sc.close();

	}

}
