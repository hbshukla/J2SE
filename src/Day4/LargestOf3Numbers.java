package day4;

public class LargestOf3Numbers {

	public static void main(String[] args) 
	{
	int a=32, b=31, c=30;
	
	if(a>b && a>c)
	{
		System.out.println("A is the Largest Number : " + a);
	}
	else if(b>a && b>c)
	{
		System.out.println("B is the Largest Number : " + b);
	}
	else
	{
		System.out.println("C is the Largest Number : " + c);
	}

	}

}
