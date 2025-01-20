package ExercisesEx;

public class CountEvenOddNumber {

	public static void main(String[] args) {
		
		int num=12345622;
		
		int even_count=0;
		int odd_count=0;
		
		while(num>0)
		{
			int remainder= num%10;
			
			if(remainder%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			num=num/10;
		}
		
		System.out.println("Even number.."+ even_count);
		System.out.println("Odd number.."+ odd_count);
	}

}
