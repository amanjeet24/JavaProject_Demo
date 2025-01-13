package Operators;

public class Local_variable {
	
	public static void main(String[] args) {
		
int a = 25; //local var
		
		{
			int b = 50; //local var
			System.out.println(a);
		}
		
		//System.out.println(b);// error becouse it declare inside the block u can't use out side 

	}

}
