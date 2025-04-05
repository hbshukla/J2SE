package Assignment;

public class Temp {
	private static boolean isPrime(int num) //method without creating an object of the class. 
	{
	for(int i=2;i<=Math.sqrt(num);i++) 
	{
		if(num%i==0)
		{
			return false;
		}
	if(num<2){
		continue;
	}
	}
return true;
	}

	public static void main(String[] args) {
		int count=0;
		System.out.println("Prime Numbers are : ");
		for(int k=2; k<=100; k++) {
			
			if (isPrime(k))
			{
				System.out.println(k);
				count++;
			}
		}
	System.out.println("Total Prime Numbers are :" + count);
	}
}
