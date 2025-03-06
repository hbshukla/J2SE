package Assignment;
//Date : 06-03-2025
public class SmallestOf3Num {

	public static void main(String[] args) {
		int a=30, b=20, c=15;
		
		if (a<b && a<c)
			{
			System.out.println("Smallest num is A : " + a);
			}
		else if(b<a && b<c)
		{
			System.out.println("Smallest num is B : " + b);
		}
		else
		{
			System.out.println("Smallest num is C : " + c);
		}
	}

}
