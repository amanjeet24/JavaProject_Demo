package StringEx;

public class RemoveJunk {

	public static void main(String[] args) {


		String s="    Java Programming   Class";
		
		s=s.replaceAll("\\s", "");
		
		System.out.println(s);
	}

}
