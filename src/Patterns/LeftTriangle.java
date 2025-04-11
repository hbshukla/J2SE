package Patterns;

public class LeftTriangle {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " "); // Print numbers from 1 to i
			}
			
			System.out.println(); // Move to the next line after each row
		}

	}
}
