package useOfString;

public class EqualIgnoreMethod {

	public static void main(String[] args) {



		String str1 = "Shashikant Gangwar";

		String str2 = "Shashikant Gangwar ";
		boolean eql = str1.equalsIgnoreCase(str2);
		
		System.out.println(eql);
		
		
	}

}
