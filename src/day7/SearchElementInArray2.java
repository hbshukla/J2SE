package day7;

public class SearchElementInArray2 {

	public static void main(String[] args) {
		
		int []a= {10,20,30,40,50,60,70,80,90,100};
		int search_element=30;
		boolean status=false;
		for(int x:a)
		{
			if(x==search_element)
			{
				status=true;
				System.out.println("Search_Element found :"+x);
				break;
			}
		}
		if(status==false) {
			System.out.println("Element not found");
		}
	}
}
