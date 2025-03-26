package Assignment;

import java.util.Arrays;

public class MinMaxNumbrInArray {

	public static void main(String[] args) {
		
		int []a= {49,3,85,54};
		
		for(int i=0;i<=a.length-1;i++)
		{
			Arrays.sort(a);
		}
		System.out.println("Length of Array is : "+a.length);
		System.out.println("Minimun NUmber is : "+ a[0]);
		System.out.println("Maximun NUmber is : "+ a[3]);
	}

}
