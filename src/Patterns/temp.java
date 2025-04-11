package Patterns;

public class temp {

    public static void main(String[] args) {
//Approach 1
        int n = 12345;
        int rev = 0;

        for (; n != 0; n = n / 10) {
            rev = rev * 10 + n % 10;
        }

        System.out.println(rev);
    
//Approach 2    	
    	int rev1 = 0;

        for (int n1 = 54321; n1 != 0; n1 = n1 / 10) {
            rev1 = rev1 * 10 + n1 % 10;
        }

        System.out.println(rev1);
}
}