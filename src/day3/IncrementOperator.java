package day3;

public class IncrementOperator {

	public static void main(String[] args) 
	{
		//++ is called increment operator
		//case1
		/*int a=10;
		System.out.println(a);//10
		a++; //a=a+1;
		System.out.println(a);//11
		*/
		
		//case2
		/*int a=10;
		int res=a++;//in post increment, assignment will happen first then value be incremented 
		
		System.out.println(res); // so here it will print "10"
		System.out.println(a);
		*/
		//Case3
		int a=10;
		int res=++a; //Pre-increment
		System.out.println(res); //here first increment will happen first "11" then it will store in "res"
		System.out.println(a);
		
		

	}

}
