package day9_String;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		//String - Immutable
		
		String s = "String";
		s.concat(" is Immutable");
		System.out.println(s); //Immutable - can not change

		//StringBuffer
		StringBuffer s1 = new StringBuffer("StringBuffer");
		s1.append(" is Mutable");
		System.out.println(s1); //Mutable - we can change original value
		
		//StringBuilder
		StringBuilder s2 = new StringBuilder("StringBuilder");
		s2.append(" is also Mutable");
		System.out.println(s2); //Mutable - we can change original value
	}

}
