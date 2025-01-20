package ExercisesEx;

import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		int a=sc.nextInt();
		
		System.out.println("Enter 2nd Number..");
		int b=sc.nextInt();
		
		System.out.println("Enter 3rd number...");
		int c=sc.nextInt();
		
		/*
		
		if(a>b && a>c)
		{
			System.out.println(a + "..is largest");
		}
		else if (b>a && b>c)
		{
			System.out.println(b + "..is largest");
		}
		else
		{
			System.out.println(c + "..is the largest");
		}
		*/
		
		//Ternary Operator
		
//		int largest1= a>b?a:b;
//		int	largest=c>largest1?c:largest1;
		
		int	largest=c>(a>b?a:b)?c:(a>b?a:b);
		
		
		System.out.println(largest + "..is largest");
	}

}
