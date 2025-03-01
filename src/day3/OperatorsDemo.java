package day3;

public class OperatorsDemo {

	public static void main(String[] args) 
	{
		//1) Arithmetic operators + - * / %
		int a=20, b=10;
		System.out.println("Sum of A and B is : " + (a+b));
		System.out.println("Diff of A and B is : " + (a-b));
		System.out.println("Multiplication of A and B is : " + (a*b));
		System.out.println("Division of A and B is : " + (a/b));
		System.out.println("Modulo Division of A and B is : " + (a%b));
		System.out.println("Modulo Division of A and B is : " + (5%12));
		
		//2) Relational /Comparison Operators > >= < <= != ==
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		b=20;
		System.out.println("a not equal to b: " +(a!=b));
		boolean res = a>b;
		System.out.println(res);
		
		//3) Logical Operators && || !
		//returns boolean value - true / false
		
		boolean x=true;
		boolean y=true;
	}

}
