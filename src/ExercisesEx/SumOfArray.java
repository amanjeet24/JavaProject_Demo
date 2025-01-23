package ExercisesEx;

public class SumOfArray {

	public static void main(String[] args) {
	
		int a[]= {5,2,3,2,6};
		
		int sum=0;
		
//		for(int i=0; i<=a.length-1; i++)    //for loop
//		{
//			sum=sum+a[i];
//		}
		
		for(int value:a)			//enhanced for loop
		{
			sum=sum+value;
		}
		
		System.out.println("Sum of Array.."+ sum);
	}

}
