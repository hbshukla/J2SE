package Assignment;

public class Temp1 {

    public static void main(String[] args) {

        int evencount = 0; // Initialize variable
        int oddcount=0; // Initialize variable
        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                evencount =evencount+1;//increase by 1 to Count for Even Numbers and store in "evencount" variable
                System.out.println("EVEN : " + i);

            } else 
            {
                oddcount+=1;
            	System.out.println("ODD  : " + i);
                
            }
             
        }
        System.out.println("Total Even Numbers : " + evencount);
        System.out.println("Total ODD Numbers  : " + oddcount);
    }
}
