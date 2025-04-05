package day7_Array;

public class SearchElementInArray1 {

	public static void main(String[] args) {
		
		int []a= {10,20,30,40,50,60,70,80,90,100};
		int search_element=40;
		boolean status=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search_element)
			{
				status=true;
				System.out.println("Search_Element found :"+a[i]);
				break;
			}
		}
		if(status==false) {
			System.out.println("Element not found");
		}
	}
}
