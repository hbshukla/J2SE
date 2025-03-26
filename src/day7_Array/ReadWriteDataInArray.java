package day7_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReadWriteDataInArray {

	public static void main(String[] args) {
		int []a= new int [5];
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.println("Enter Value for index "+i+":");
			a[i]=sc.nextInt();
		}
			System.out.println(Arrays.toString(a));
			sc.close();
	
	}
	
}
