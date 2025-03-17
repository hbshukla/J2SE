package Day6;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		//Declaring Array
		//Approach 1
		int a[][]=new int[3][2];
		/* below declaration is also correct
		//int [][]a=new int[3][2]; 
		//int []a[]=new int[3][2];*/
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;
				
//------------------------------------------------------------------------
		//Approach2	
//------------------------------------------------------------------------
	
		int b[][]= { 
				{100,200},
				{300,400},
				{500,600}
		};
		//Find Size of an array
		System.out.println("Length of Rows : " + b.length);
		System.out.println("Length of Columns : " + b[0].length); 
		
		//Read single value of an array
		System.out.println(a[2][0]);
		
	}

}
