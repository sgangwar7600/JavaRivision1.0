package useOfString;


//   StringTokenizer is used for splitting the string into tokens based on some delimiters.

// StringTokenizer is meant for a whole different purpose then the former two: cutting strings into pieces, rather than assembling.

// StringBuffer serves same purpose as StringBuilder except that StringBuffer is thread-safe.




import java.util.StringTokenizer;

public class StringTokenizerobject {

	public static void main(String[] args) {


		StringTokenizer st = new StringTokenizer("shashikant gangwar") ;
		
		System.out.println(st.hasMoreTokens());
		System.out.println(st.countTokens());
		System.out.println(st.hashCode());
		System.out.println(st.hasMoreElements());
		System.out.println(st.nextElement());
		System.out.println(st.nextToken());
		/*
		 * while(st.hasMoreTokens()) {
		 * 
		 * System.out.println(st.nextToken()); }
		 */
	}

}
