package Patterns;

public class RightTriangle {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			for(int s=5; s>=i; s--) 
			{
			System.out.print(" ");	
			}
			for(int j=1; j<=i; j++) 
			{		
			System.out.print(j); // Print numbers from 1 to i
			}
			
			System.out.println(); // Move to the next line after each row
		}

	}

}
