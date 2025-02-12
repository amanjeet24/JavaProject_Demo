package Loops;

public class ContinueStatement {

	public static void main(String[] args) {


		for(int i=0; i<=10; i++)
		{
			if (i==5)
			{
				continue;  //for break, jump out of the for loop when condition is true and for continue, controller skip that statement if condition is true,controller jump to inr/dcr
			}
			System.out.println(i);
		}
	}

}
