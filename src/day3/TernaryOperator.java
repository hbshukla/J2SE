package day3;

public class TernaryOperator {

	public static void main(String[] args) 
	{
		//Example 1
		int a=100, b=200;
		int x=(a<b)? a:b;
		System.out.println(x);

		//Example 2
		
		int c=(1==1) ? 100:200;
		System.out.println(c);
		
		//Example 3
		
		int d=(1==2)?250:352;
		System.out.println(d);
		
		//Example 4
		int age=30;
		
		String res=(age>18)? "Eligible":"Not Eligible";
		System.out.println(res);
	}

}
