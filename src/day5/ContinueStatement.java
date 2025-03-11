package day5;

public class ContinueStatement {

	public static void main(String[] args) 
	{
		for(int i=1; i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}

	System.out.println("//Skip 3, 5 and 9 with continue statement");
	// Second loop: skip 3, 5, and 9
	
		for(int a=1; a<=10; a++)
		{
			if(a==3 || a==5 || a==9){
			continue;
			}
		System.out.println(a);
		}	
	}
	
}

