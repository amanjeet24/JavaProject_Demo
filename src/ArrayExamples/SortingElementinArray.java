package ArrayExamples;

import java.util.Arrays;

public class SortingElementinArray {

	public static void main(String[] args) {


		int a[]= {100,600,300,700,200,500};
		
		System.out.println("Before sorting");
		
	System.out.println(Arrays.toString(a));

	Arrays.sort(a);
	System.out.println("After sorting");
	System.out.println(Arrays.toString(a));
			
	}

}
