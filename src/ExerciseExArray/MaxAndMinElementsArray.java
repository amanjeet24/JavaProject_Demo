package ExerciseExArray;

public class MaxAndMinElementsArray {

	public static void main(String[] args) {
		int a[]= {50,20,30,40,60};
		
//		int max=a[0];
//		
//		for(int i=1;i<a.length;i++)
//		{
//			if(a[i]>max)
//			{
//				max=a[i];
//			}
//		}
//		System.out.println("Max element in Array..." +max);
		
		int min=a[0];
		for(int i=1; i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Min element in Array..." +min);
		
	}

}
