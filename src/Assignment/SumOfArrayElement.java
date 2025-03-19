package Assignment;

public class SumOfArrayElement {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8,9,10,11};
		int sum=0;
		for(int arr:a)
		{
			
			
			System.out.println();
			sum=sum+arr;
			
			if(arr%2==0)
			{
				System.out.println(arr + " = Even Number");
			}
			else
			{
				System.out.println(arr + " = Odd Number");
			}
		
		}
		
		System.out.println("Total of Array Number is : " + sum);
					
		
	}

}
