package Assignment;

public class Temp2 {

    public static void main(String[] args) {

        int [] a = {1, 2, 3, 4, 5, 6, 7};
        
        boolean [] processed = new boolean[a.length];
        
        for(int i = 0; i < a.length; i++) {
            if (processed[i]) {
                continue; // Skip the already processed elements
            }
            for (int j = 0; j < a.length; j++) {
                
                    processed[j] = false;  // Mark a[j] as processed (avoid counting it again)
                
            }

            
            
        }
    }
}
