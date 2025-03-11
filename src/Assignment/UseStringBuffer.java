package Assignment;

import java.util.Scanner;

//Date : 11-03-2025

public class UseStringBuffer {

	public static void main(String[] args) {
		//Using String Buffer Class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num=sc.nextInt();
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		
		System.out.println("Reverse Number is : "+ rev);
		sc.close();
	}

}
