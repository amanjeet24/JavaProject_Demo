package ExercisesEx;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		//1st approach
		/*
		int rev=0;
		
		while(num!=0)
		{
			rev= rev*10 + num%10;
			num= num/10;
		}
		System.out.println("Reverse num is.." +rev);
*/
		
		//2nd 
		/*
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		
		StringBuffer rev=sb.reverse();
		System.out.println("Reverse num is.." +rev);
		*/
		
		
		//3rd
		StringBuilder sb=new StringBuilder();
		sb.append(num);
		StringBuilder rev= sb.reverse();
		System.out.println("Reverse num is.." +rev);
	}

}
