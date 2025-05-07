package Assignment;

public class RemoveJunk {

	public static void main(String[] args) {
		String s = "@!#$% abcd %^&*( Jai HInd";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
