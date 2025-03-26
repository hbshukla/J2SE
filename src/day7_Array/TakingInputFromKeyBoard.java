package day7_Array;

import java.util.Scanner;

public class TakingInputFromKeyBoard {

	public static void main(String[] args) {
		
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enrter Decimal Number :");
	 double num = sc.nextDouble();
	 System.out.println(num);
	 
	 
	 System.out.println("Entrer City :");
	 String city = sc.next();
	 System.out.println("Entrered City is :" + city);
	 
	
	System.out.println("Enter Unknown Value :");
	Object value =sc.next();
	System.out.println("Object value is :"+value);
	sc.close();
	}

}
