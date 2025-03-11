package Assignment;

import java.util.Scanner;

public class StringBuilderClass {

	public static void main(String[] args) {
		//Using String Builder Class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num=sc.nextInt();
		
		StringBuilder sb=new StringBuilder();
		sb.append(num);
		StringBuilder rev=sb.reverse();
		System.out.println("Reverse Number is : "+ rev);
		sc.close();
	}
	
}
