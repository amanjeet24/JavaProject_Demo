package ExercisesEx;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string..");
		
		String str= sc.next();
		String org_str=str;
		String rev="";
		
		for(int i=str.length()-1; i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if(org_str.equals(rev))   //can also use ==
		{
			System.out.println(org_str +"  String is Palindrome");
		}
		else
		{
			System.out.println(org_str  + "  String is not Palindrome");
		}

	}

}
