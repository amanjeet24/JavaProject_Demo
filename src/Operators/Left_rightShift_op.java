package Operators;

public class Left_rightShift_op {
	
	public static void main(String[] args) {
		
		
		  int a = 3;
		  int b = 2;
		  
		    System.out.println(a & b); //2
			System.out.println(a | b); // 3
			System.out.println(a ^ b); //1
			 
			
//		 *********************** left shift  ***********************
			
			a = 2;
			System.out.println(a << 1); // 4
			System.out.println(a << 2); //2+2 = 4 + 4 =8
			System.out.println(a << 5); //64
			
			// 2 + 2 = 4 + 4 = 8 + 8 = 16 + 16 = 32 + 32 = 64
			//***************  right **************************
			
			b = 8;
			System.out.println(b >> 1); // 4
			System.out.println(b >> 2); //2
			System.out.println(b >> 3); //1
			System.out.println(b >> 4);//0
			System.out.println(b >> 5);
			
			int y = (a > b) ? 4 : 5;
			
			System.out.println(y);
			
		//*************************************************************************
			int num = 15;
//			 when the num div by 3 u shoude fill the  z values is "num div by 3 " other wise num not div by 3
			
			String z = (num % 3 == 0) ? "num div by 3" : "num not div by 3";
			System.out.println(z);
			
	}

}
