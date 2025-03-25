package day7;

import java.util.Arrays;

public class SortingElementInArray {

	public static void main(String[] args) {
		
		int [] a= {100,900,780,200,240,540,125};
		
		System.out.println(Arrays.toString(a));
		System.out.println("After Sort");
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		for(int x:a)
		{
			System.out.println(x);
		}
	}

}
