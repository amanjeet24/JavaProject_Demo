package StringEx;

public class CountCharacterOccurance {

	public static void main(String[] args) {


		String s="Java Programming in Java Language";
		
		int total_count=s.length();
		int count_after_removing_char = s.replace("a", "").length();
		
		int count= total_count - count_after_removing_char;
		System.out.println("Total number of counts..." +count);
	}

}
