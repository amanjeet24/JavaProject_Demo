package ExercisesEx;

public class Swap2No {

	public static void main(String[] args) {


		int a=10, b=20;
		
		//1st logic
		/*
		System.out.println("Before swap...." +a+ "  "+b);
		
		int t=a;
		a=b;
		b=t;
		
		System.out.println("After swap...." +a+ "  "+b);
		
		
		//2nd logic
		System.out.println("Before swap...." +a+ "  "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap...." +a+ "  "+b);
		

		
		//3rd logic
				System.out.println("Before swap...." +a+ "  "+b);
				a=a*b;
				b=a/b;
				a=a/b;
				System.out.println("After swap...." +a+ "  "+b);
				
						*/
				
		//4th logic
				System.out.println("Before swap...." +a+ "  "+b);
				b=a+b-(a=b);
				System.out.println("After swap...." +a+ "  "+b);
	}

}
