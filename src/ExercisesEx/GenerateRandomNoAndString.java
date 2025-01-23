package ExercisesEx;

import java.util.Random;

public class GenerateRandomNoAndString {

	public static void main(String[] args) {

		//Approach 1--Random Class
	
		Random rand= new Random();
		int rand_int= rand.nextInt(100);   //0 to 999 range
		System.out.println(rand_int);
//		
//		double rand_db1=rand.nextDouble();		//0.0 to less than 1.0
//		System.out.println(rand_db1);
		
		//Approach2 -- Math-- by default generate decimal number
//		System.out.println(Math.random());
		
		//Approach3--Apache commons-lang API
		
//		String randNum=RandomStringUtils.randomNumeric(5);		//RandomStringUtils class from apache commons-lang API dependency 
//		System.out.println(randNum);
		
//		RandomStringUtils.RandomAlphabetic(5);
	}

}
