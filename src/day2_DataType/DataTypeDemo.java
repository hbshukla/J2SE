package day2_DataType;

public class DataTypeDemo {

	public static void main(String[] args) 
	{
	//byte -128 to 127
	
		byte by=125;
		System.out.println(by);
		
		short sh=3535; //-32768 to 32767
		System.out.println(sh);
		
		long l=12345678912345l; //-9223372036854775808  to 9223372036854775807
		System.out.println(l); //literal is needed
		
		//Decimal Number - float - double
		
		float item_price=15.5f;
		System.out.println(item_price);//literal is needed
		
		double dbl=1234.4321;
		System.out.println(dbl);
		
		char grad = 'A';
		System.out.println(grad);

		//==================
		String name = "Hemant";
		//String name = 'Hemant' //Invalid
		System.out.println(name);
		
		boolean b1=true;
		System.out.println(b1);
		
		String c1="true";
		System.out.println(c1);
						
}
}
