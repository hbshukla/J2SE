package Assignment;

public class Temp_asn {
	public static void main(String[] args) {
		int n = 678910;
		 int originalLength = String.valueOf(n).length();  // count original digits
		int rev =0;
		while(n!=0) {
			rev = rev*10 + n%10;
			n = n/10;
			
		}
		System.out.printf("%06d\n",rev);
		 //System.out.printf("%0" + originalLength + "d\n", rev);
		 System.out.printf("%03d", 42);
}
}