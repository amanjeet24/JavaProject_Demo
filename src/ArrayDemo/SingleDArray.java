package ArrayDemo;

public class SingleDArray {

	public static void main(String[] args) {
		
		//int a[]= new int[5];
		
		
		int a[]= {100,200, 300,400,500};
		
		System.out.println("Length of an array:" + a.length);
		

//		for (int i=0; i<a.length; i++)
//		{
//			System.out.println(a[i]);
//		}
		
		for (int i:a)
		{
			System.out.println(i);
		}
	}

}
