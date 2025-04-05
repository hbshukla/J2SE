package day7_Array;
//import java.util.Arrays;

public class SearchRepeatElementInArray1 {
	public static void main(String[] args) {
		int[] a = { 91,91,10,20,30,40,10,20,30,50,10,10 };
		// Transfer elements from a to b
		for (int i = 0; i < a.length; i++) {
			boolean isDuplicate = false;
		// Check if this element has already been seen
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					isDuplicate = true;
					break; /* as soon as duplicate element fount, then after break, it will return to 
					outer loop to check further element. break is used to exit from inner loop*/
				}
			}
			if (isDuplicate) {
                int count = 0;// Reset the count for each element
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