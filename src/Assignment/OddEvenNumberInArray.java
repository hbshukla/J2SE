package Assignment;

public class OddEvenNumberInArray {

	public static void main(String[] args) {
		
		int []a = {1,2,3,4,5,6,7,8,8,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
		
		for(int i=0; i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
			
		}

	}
	
}
