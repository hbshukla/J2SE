package Assignment;

public class ReverseNumber1 {

	public static void main(String[] args) 
	{
		int num=1234;
		int revnum=0;	
		//Reverse the Number
		while(num!=0)
		{
			//int mod=num%10; //Extract the last digit
			
			revnum=revnum*10+num%10; //build  the reverse number
			num=num/10; //Remove the last digit from the original number
		}
		System.out.println("Reversed Number is : "+ revnum);
	}

}
