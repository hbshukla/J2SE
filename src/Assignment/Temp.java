package Assignment;
import java.util.Scanner;
public class Temp {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String");
	
	String str = sc.nextLine();
	
	StringBuilder sb = new StringBuilder(str);
	StringBuilder rev= sb.reverse(); 
	System.out.println(rev);
	sc.close();
	}
			
	}

