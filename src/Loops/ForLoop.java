package Loops;

public class ForLoop {

	public static void main(String[] args) {
		
		/*
		for(int i=1;i<=10;i++) {
			
			System.out.println(i);
		} 

		for(int i=2; i<=10; i+=2) {
			
			System.out.println(i);
		} */
		
		for (int i=1; i<=10; i++)
		{
			if (i%2==0)
				
			{
				System.out.println(i + " Even");
			}
			else
			{
				System.out.println(i + " Odd");
			}
		}
	}
	

}
