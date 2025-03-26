package day7_Array;
//import java.util.Arrays;

public class SearchRepeatElementInArray {
    public static void main(String[] args) {   
        int[] a = {10, 100,20, 30, 40, 50, 60, 70, 80, 90, 100,20, 20, 20, 30,10, 50,100};      
        // Create a new array b with the same length as a
        //int[] b = new int[a.length];     
        // Transfer elements from a to b
        for (int i = 0; i < a.length; i++) {
            for(int j=0; j<i; j++)
        	a[i] = a[j];
        }
        // Use an auxiliary array to mark processed elements
        boolean[] processed = new boolean[a.length];  // Now use b.length since we're processing b[]
        
        // Count and print how many times each element in b repeats in a
        for (int i = 0; i < a.length; i++) 
        {
            // Skip if this element has already been processed
            if (processed[i]) 
            {
                continue;
            }
            //System.out.println(b[i]);
            int count = 0;

            // Count how many times b[i] appears in a
            for (int k = 0; k < a.length; k++) 
            {
                if (a[i] == a[k]) 
                {
                    count++;
                    processed[k] = true;  // Mark a[j] as processed (avoid counting it again)
                }
            }

            // If count is greater than 0, print the element and its count
            if (count > 0) {
                System.out.println("Element " + a[i] + " is repeated " + count + " times.");
            //}
        }
    }
}
}