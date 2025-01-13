package StringEx;

public class ReverseAString {

	public static void main(String[] args) {
		
		
		String s="Selenium";
		
		String rev="";
	
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev= rev+ s.charAt(i);
		
		}
		
		System.out.println("Reverse String is    " + rev);
		
		
		
		//using StringBuffer Class
		
		/*
		StringBuffer s = new StringBuffer("Welcome");
		System.out.println("Reverse String is   "+s.reverse());
		*/
		
		//using StringBuilder Class
		/*
		StringBuilder s=new StringBuilder("WelCome");
		System.out.println("Revrese string is  " + s.reverse());
		*/
	}

	/*
	private static String String(char charAt) {
		// TODO Auto-generated method stub
		return null;
	}
*/
}
