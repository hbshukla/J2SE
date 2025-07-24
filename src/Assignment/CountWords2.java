package Assignment;

import java.util.Scanner;
public class CountWords2 {

	public static void main(String[] args) {
        System.out.println("Enter String:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();

        int count = 0;
        if (!s.isEmpty()) {
            String[] words = s.split("\\s+");
            count = words.length;
        }

        System.out.println("Count of Words: " + count);
    sc.close();
	}
}
