package ArrayDemo;

public class MultiDArray {

	public static void main(String[] args) {
		
		int a[][]= {
				{
					100,200
				}, {
					300, 400
				},
				{
					500, 600
				}
		};
		
		System.out.println("length of row:"+a.length);
		System.out.println("length of column" + a[0].length);

//		for(int r=0; r<=2; r++) {
//			for (int c=0;c<=1;c++)
//			{
//				System.out.print(a[r][c] +"  ");
//		
//			}
//			System.out.println();
//		}
//	}
	
//	for(int r=0; r<=a.length-1; r++)
//	{
//		for(int c=0; c<=a[r].length-1; c++) 
//		{
//			System.out.print(a[r][c]+ "  ");
//		}
//		System.out.println();
	//}
	
	for (int arr[]:a) {
		
		for (int x:arr) {
			System.out.print(x + "  ");
		}
		System.out.println();
	}

}
}
