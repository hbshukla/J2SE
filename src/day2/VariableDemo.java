package day2;

public class VariableDemo {

	public static void main(String[] args) 
	{
		int i =1; //declaration + assignment 
		System.out.println(i+1);

		i = 100;
		System.out.println(i+1);
		
		//Approach-1
		/*int a =100;
		int b =200;
		int c =300;*/
		
		//Approach-2
		/*int a,b,c; //Declaration
		int a =100; //Assignment
		int b =200;
		int c =300;*/
		
		//Approach-3
		int a=100,b=200,c=300;
		System.out.println("The value of a is:"+a);
		System.out.println(b);
		System.out.println(""+a+b+c);
		System.out.println(a+","+b+","+c);
	}

}
