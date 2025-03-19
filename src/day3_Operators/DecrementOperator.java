package day3_Operators;

public class DecrementOperator {

	public static void main(String[] args) {
		//Case 1
		int a=10;
		a--; //a=a-1;
		System.out.println(a);
		
		//Case 2
		int i =100;
		int res =i--; //1st assignment will happen then decrement will be done
		System.out.println(res);//100
		
		//case 3
		int d=100;
		int res1=--d; //ast decrement will be done then assignment will happen
		System.out.println(res1);

	}

}
