package Loops;

public class WhileLoop {

	public static void main(String[] args) {

/*
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		*/
		
		int i=1;
		while(i<=10) {
			
			if(i%2==0) {
				
				System.out.println(i+ " Even");
			}
			else
			{
				System.out.println(i+ " Odd");
			}
			i++;
		}
	}

}
