package Assignment;
//Date : 06-03-2025
//Print Largest Number by If else and Ternary Operator

public class LargestNumber {

	public static void main(String[] args) {
		//using if - else
		int a = 10, b=20;
		
		if(a>b)
		{
			System.out.println("A is the Largest Number : " + a);
		}
		else
		{
			System.out.println("B is the Largest Number : " + b);
		}
	
		//using ternary operator
		int x=40, y=80;
		
		String res=(x<y)? "Large Num":"Not Large Num";
		System.out.println(res);
		
		
	}

}
