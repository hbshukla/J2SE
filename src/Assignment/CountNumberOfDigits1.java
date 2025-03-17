package Assignment;

import java.util.Scanner;

public class CountNumberOfDigits1 {

    public static void main(String[] args) {

    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Number : ");
    	int num = sc.nextInt();
    	
    	int m=0;
    	int ev=0;
    	int od=0;
    	while(num!=0)
    	{
    		m = num%10;
    		{
    			if(m%2==0)
    			{
    				ev++;
    			}
    			else
    			{
    				od++;
    			}
    		}
    		num=num/10;
    	}
    	System.out.println("Even Count :" +ev);
    	System.out.println("Odd Count  :" + od);
    	
    	sc.close();
    }	
    
}
