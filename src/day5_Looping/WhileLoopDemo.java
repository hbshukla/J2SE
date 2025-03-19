package day5_Looping;

public class WhileLoopDemo {

	public static void main(String[] args) 
	{
		//Example-1: Print 1...10
		int i=1; //Initialization
		while(i<=10) //Condition
		{
		System.out.println(i);
		i++;
		}
		
		//Example-2: Print Hello Message 10 Times");
		System.out.println("//Example-2: Print Hello Message 10 Times");
		int a=1;
		while(a<=10)
		{
			System.out.println("Hello");
			a++;
		}
		//Example-3: Print Even Numbers between 1 to 10
		System.out.println("//Example-3: Print Even Numbers between 1 to 10");
		//Approach1
		int b=2;
		while(b<=10)
		{
			System.out.println(b);
			b=b+2;
		}
		
		//Approach2
		int c=1;
		while(c<=10)
		{
			if(c%2==0) 
			{
			System.out.println(c);
			}
			c++;
		}
		
		//Example-4: Print Even & Odd Numbers between 1 to 10
		System.out.println("//Example-4: Print Even & Odd Numbers between 1 to 10");
		
		int d=1;
		while(d<=10)
		{
			if(d%2==0)
			{
				System.out.println(d+ " is Even Number ");
			}
			else
			{
				System.out.println(d+" is Odd Number");
			}
			d++;
		}
		//Example-5: Print between 10 to 1
		System.out.println("//Example-5: Print between 10 to 1");
		int e=10;
		while(e>=1)
		{
			System.out.println(e);
			e--;
		}
		
	}

}
