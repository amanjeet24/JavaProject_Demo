package ArrayExamples;

import java.util.Scanner;

public class TakingInputFromKeyboard {

	public static void main(String[] args) {
	
		
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("ENter the number");
		int num=sc.nextInt();
		
		//double num=sc.nextDouble();
		
		// String city=sc.next();
		
		System.out.println("Given num is  " + num);
	}

}
