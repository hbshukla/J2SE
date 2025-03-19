package Day6_Array;

public class ObjectArray {

	public static void main(String[] args) {
		
//Approach-1		
		Object a[] = {100,1.5,"ABC",true};
		
		for(Object x:a)
		{
			System.out.println(x);
		}
//Approach-2
		System.out.println();
		System.out.println("Approach-2");
		for(int i=0; i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}
	

}
