package Assignment;

import java.util.Arrays;

public class MinMaxNumbrInArray1 {

		public static void main(String[] args) {

			int []a= {78,89,56,56,48,41,48,22,76,72,3,27,45,49,36,81,144,169};
			
			int max = Arrays.stream(a).max().getAsInt();
			int min = Arrays.stream(a).min().getAsInt();
			System.out.println(max);
			System.out.println(min);
			int max1 = a.length > 0 ? Arrays.stream(a).max().getAsInt() : Integer.MIN_VALUE;
			System.out.println(max1);
		}
	}