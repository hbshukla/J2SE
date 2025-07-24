package Assignment;

public class CountChar1 {

	public static void main(String[] args) {
		String s = " Welcome to Java - Selenium Course";
		
		int tc = s.length();
		String rs = s.replace("e", "");
		int rc= rs.length();
		int oc=tc-rc;
		
		System.out.println("Total count of e is : "+ oc);
	}

}
