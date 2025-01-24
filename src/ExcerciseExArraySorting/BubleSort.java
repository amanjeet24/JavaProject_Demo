package ExcerciseExArraySorting;

import java.util.Arrays;

public class BubleSort {

	public static void main(String[] args) {


		int a[]= {1,4,3,2,6,5};
		
		System.out.println("Before sorting.." + Arrays.toString(a));
		
		int n=a.length;
		
		for(int i=0; i<n-1; i++)   //for number of Passes
		{
			for(int j=0; j<n-1; j++)  //for number of iterations
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("After sorting.." + Arrays.toString(a));
	}

}
