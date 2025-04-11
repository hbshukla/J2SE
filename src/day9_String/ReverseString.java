package day9_String;

public class ReverseString {

	public static void main (String [] args) {
		//Approach1
		String s = "W e l c o m e";
		String rev = "";
				
				for(int i = s.length()-1; i>=0; i--)
				{
				rev=rev+s.charAt(i);	
				}
				System.out.println("Reverse String is : "+rev);
//=======================================================================
// ASpproach-2 - By Converting string to char array type 
				String s1 = "W e l c o m e";
				String rev1 = "";
				
				char []a=s1.toCharArray();
				
				for(int j=a.length-1; j>=0; j--)
				{
					rev1 = rev1+a[j];
				}
				System.out.println("Reverse String is : " + rev1);
	}	
}


