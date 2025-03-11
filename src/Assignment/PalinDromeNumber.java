package Assignment;

import java.util.Scanner;

public class PalinDromeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num=sc.nextInt();
		
		int originalNum=num; // Store the Original Number 
		int revnum=0;
		while(num !=0)
		{
			revnum=revnum*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse Number is : " + revnum);
		
		if(revnum==originalNum)
		
		{
			System.out.println("Entered number is palindrome");
		}
		else
		{
			System.out.println("Entered number is not palindrome");
		}	
	sc.close();		
	}

}
