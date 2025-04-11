package Assignment;

import java.util.Arrays;

public class MaxInArray {

	public static void main(String[] args) {
		int [] a= {10,1,56,89,7,65,32,64,29,30,65,70,99,101};
		
		int max=a[0];
		for(int i=0; i<=a.length-1;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}System.out.println("Max Number is : "+ max);

		int max1 = Arrays.stream(a).max().getAsInt();
		System.out.println(max1);
	}

}
