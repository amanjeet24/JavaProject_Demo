package ArrayExamples;

import java.util.Arrays;

public class SortingStrings {

	public static void main(String[] args) {
		
	//	char s[]= {'D', 'F', 'A', 'C'};
		
		String s[] = {"Scott", "Marry", "John", "Dvaid"};
		
		System.out.println("Before sorting   " + Arrays.toString(s));
		
		Arrays.sort(s);
		
		System.out.println("After sorting    "+ Arrays.toString(s));
	}

}
