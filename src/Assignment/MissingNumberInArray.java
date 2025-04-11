package Assignment;
import java.util.Arrays;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5,7,8,9,10,13,14,20};    

// Find the maximum number in the array
        int max = Arrays.stream(a).max().getAsInt();
        
// Check for missing numbers in the range from 1 to max
        for (int i = 1; i <= max; i++) {
            boolean numFound = false;
            for (int j = 0; j < a.length; j++) {
                if (i == a[j]) {
                    numFound = true;
                    break;  // No need to continue searching once we've found a match
                }
            }
            if (!numFound) {
                System.out.println("Missing Number: " + i);
            }
        }
    }
}
