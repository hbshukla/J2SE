package day5;

public class ForLoopDemo {

	public static void main(String[] args) 
	{ 
	
		for(int i=1; i<=5; i++)
		{
			System.out.println(i);
		}
	
	System.out.println("//1..10 Print Even Numbers Approach 1");
	
		for(int a=1; a<=10; a++)
		{
			if(a%2==0)
			{
				System.out.println(a + " Even");
			}
			else
			{
				System.out.println(a + " Odd");
			}
		}
		System.out.println("//1..10 Print Even Numbers Approach 2");
		for(int b=2; b<=10; b=b+2) //or b+=2 
		{
			System.out.println(b);
		}
	}
} 
