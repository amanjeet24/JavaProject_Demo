package StringEx;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {


		String s="^%%*&(*$#$@GFDHGS ghfgjuj 6687 $^%#$";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
	}

}
