package day6_Array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// Declaring Array
		// Approach 1
		int [][]a = new int[3][2];
		/*
		 * below declaration is also correct //int [][]a=new int[3][2]; //int []a[]=new
		 * int[3][2];
		 */
		a[0][0] = 100;
		a[0][1] = 200;
		a[1][0] = 300;
		a[1][1] = 400;
		a[2][0] = 500;
		a[2][1] = 600;

		System.out.println(a.length);
//------------------------------------------------------------------------
// Approach2
//------------------------------------------------------------------------
		System.out.println();
		System.out.println("Approach-2 :");

//Declaring Array
		int b[][] = { { 100, 200 }, { 300, 400 }, { 500, 600 }, { 700, 800 }, { 900, 1000 } };
// Find Size of an array
		System.out.println("Length of Rows : " + b.length);
		System.out.println("Length of Columns : " + b[0].length);

// Read single value of an array
// System.out.println(a[2][0]);
		System.out.println();
// Normal ForLoop
// if b<= then b.length-1, else
// b< then b.length
		System.out.println("b.length : " + b.length);
		for (int r = 0; r < b.length ; r++) {
			for (int c = 0; c <= b[r].length - 1; c++) {
				System.out.println(b[r][c] + " ");
			}
		}

//------------------------------------------------------------------------
// Enhanced ForLoop - (Two Dimensional)	
//------------------------------------------------------------------------
		System.out.println();
		System.out.println("Enhanced ForLoop");
		for (int arr[] : b) {
			for (int x : arr) {
				System.out.println(x);
			}
		}
	}

}
