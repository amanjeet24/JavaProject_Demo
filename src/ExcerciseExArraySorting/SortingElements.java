package ExcerciseExArraySorting;

import java.util.Arrays;
import java.util.Collections;

public class SortingElements {

	public static void main(String[] args) {


		//int a[]= {10,50,30,20,40,70};
		
//		//Approach 1
//		System.out.println("Before sorting..." + Arrays.toString(a));
//		Arrays.parallelSort(a);
//		System.out.println("After sorting..." + Arrays.toString(a));

//		//Approach 2
//				System.out.println("Before sorting..." + Arrays.toString(a));
//				Arrays.sort(a);
//				System.out.println("After sorting..." + Arrays.toString(a));
				

				//Approach 3-- in reverse descending order

				Integer a[]= {10,50,30,20,40,70};   //datatyoe is Integer because collections.reverseorder does not support primitive datatype int
						System.out.println("Before sorting..." + Arrays.toString(a));
						Arrays.sort(a, Collections.reverseOrder());
						System.out.println("After sorting..." + Arrays.toString(a));
	}

}
