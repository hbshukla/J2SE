package Patterns;

public class RightLeftTriangle {

	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= n; i++) {

			// Left side: increasing numbers
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			// Middle spaces
			int spaces = 2 * (n - i); // Each space group is "  "
			for (int s = 1; s <= spaces; s++) {
				System.out.print("  "); // Double space for formatting
			}

			// Right side: decreasing numbers
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}

			// Move to next line
			System.out.println();
		}
	}
}
