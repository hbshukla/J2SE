package day7;
//import java.util.Arrays;

public class SearchRepeatElementInArray1 {
	public static void main(String[] args) {
		int[] a = { 91,91,10,20,30,40,10,20,30,50,91,10,10 };
		// Transfer elements from a to b
		for (int i = 0; i < a.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					isDuplicate = true;
					continue;
				}
			}
			if (isDuplicate) {
                int count = 0;
                // Count how many times this element appears
                for (int k = 0; k < a.length; k++) {
                    if (a[i] == a[k]) {
                        count++;
                    }
                }
                // Print the element and its count, and ensure it's only printed once
                System.out.println("Element " + a[i] + " repeated " + count + " times");
			
		}

	}
}
}