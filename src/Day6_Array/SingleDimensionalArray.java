package day6_Array;
/*
 * Declare an array
 * Add value into array
 * Find Size of an array
 * Read single value from an array
 * Read multiple value from an array 
 */

public class SingleDimensionalArray {

	public static void main(String[] args) 
	{
	// declaring array
	//Approach 1
	int a[]=new int[5];
	a[0]=100;
	a[1]=200;
	a[2]=300;
	a[3]=400;
	a[4]=500;
	
	
//------------------------------------------------------------------------
	//Approach2
//------------------------------------------------------------------------
	
	int b[]= {100,200,300,400,500,600,700};

	//find length of array
	System.out.println(a.length);
	System.out.println(b.length);
	System.out.println(a[4]);//4 is index number
	System.out.println(b[6]);//8 is index number
	System.out.println();
	//Normal Loop
	for(int i=0;i<a.length; i++)
	{
		System.out.println("Length of [a]["+ i +"] : " + a[i]);
	}
	
	//Enhanced for loop / for..each loop
	System.out.println();
	System.out.println("Enhanced For-Loop:");
	
	for(int x:b)
		System.out.println(x);
	}

}
