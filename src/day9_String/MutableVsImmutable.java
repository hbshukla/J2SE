package day9_String;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		
		//Mutable - can change
		int [] a= {200,20,50,30,10,24,45};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);//mutable
		System.out.println(Arrays.toString(a));
		
		//Immutable	
		String s = "Welcome";
		System.out.println(s);
		String concatestring=s.concat(" 	To Java");
		System.out.println(s); // Immutable - we can not change
		System.out.println(concatestring);
		
	}

}
