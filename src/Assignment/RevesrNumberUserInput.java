package Assignment;

import java.util.Scanner;

public class RevesrNumberUserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num=sc.nextInt();
		
		int revnum=0;
		
		while(num !=0)
		{
			revnum=revnum*10+num%10;//Building Reverse Number
			num=num/10; //Remove last digit
		}
		System.out.println(revnum);
		
		sc.close();
	}

}
