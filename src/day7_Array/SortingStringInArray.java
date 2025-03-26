package day7_Array;

import java.util.Arrays;

public class SortingStringInArray {

	public static void main(String[] args) {
		
		//char s[] = {'a','b','v','c','z','r'};
		String s[] = {"Harshal", "Hemant","Harsh","Hiren","piyu","Samrat" };
		System.out.println(Arrays.toString(s));
		//Arrays.sort(s);
		Arrays.sort(s, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(s));
		
	}

}
/*String.CASE_INSENSITIVE_ORDER maintains lexicographical order, but ignores case when comparing strings.

The characters are compared in the same order as in lexicographical sorting, 
but the case of the characters doesn't affect the result.

It doesn't change the underlying lexicographical sorting process; 
it simply ensures that uppercase and lowercase characters are treated the same during comparisons.*/
