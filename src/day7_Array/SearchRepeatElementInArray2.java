package day7_Array;


public class SearchRepeatElementInArray2 {
    public static void main(String[] args) {
        int[] a = {10, 100, 20, 30, 40, 50, 60, 70, 80, 90, 100, 20, 20, 20, 30, 50, 100,100};
        
        // Use an auxiliary array to mark processed elements
        boolean[] processed = new boolean[a.length];

        // Count and print how many times e	ach element repeats in a
       for (int i = 0; i < a.length; i++) {
            // Skip if this element has already been processed
            if (processed[i]) {
                continue;
            }

            int count = 0;

            // Count how many times a[i] appears in a
            for (int k = 0; k < a.length; k++) {
                if (a[i] == a[k]) {
                    count++;
                    processed[k] = true;  // Mark a[k] as processed (avoid counting it again)    
                }
               // System.out.println("processed[" + k + "] = " + processed[k]);
            }
           
            // If the element appears more than once, print it
            //if (count > 1) {
               System.out.println("Element " + a[i] + " is repeated " + count + " times.");
            //}
                //System.out.println("processed[" + i + "] = " + processed[i]);
       }
       
    }
}
