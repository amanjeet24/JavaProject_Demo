package StringEx;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		String s="Welcome to Java";
		
		//Approach 1
//		String[] words=s.split(" ");
//		
//		String reverseString="";
//		
//		for(String w:words)
//		{
//			String reverseWord="";
//			for(int i=w.length()-1; i>=0; i--)
//			{
//				reverseWord=reverseWord+w.charAt(i);
//			}
//			
//			reverseString=reverseString+reverseWord+" ";
//		}
//		
//		
//		System.out.println(reverseString);
		
		//Approach 2
		
		String[] words=s.split("\\s");
		
		String reverseWord="";
		
		for(String w:words)
		{
			
		StringBuilder sb= new StringBuilder(w);
		sb.reverse();
			
		reverseWord=reverseWord+sb.toString()+" ";
		}
		
		
		System.out.println(reverseWord);
	}

}
