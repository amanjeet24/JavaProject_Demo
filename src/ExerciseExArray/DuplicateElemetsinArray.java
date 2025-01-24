package ExerciseExArray;

import java.util.HashSet;

public class DuplicateElemetsinArray {

	public static void main(String[] args) {
		
		String arr[]= {"Java", "C", "C++", "Python", "Java"};
		
		//Approach1
//		boolean flag=false;
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					System.out.println("Found Duplicate Element..."+arr[i]);
//					flag=true;
//				}
//			}
//		}
//		
//		if(flag==false)
//		{
//			System.out.println(" Duplicate Element nOt found...");
//		}
		
		//Approach 2
		
		HashSet<String> langs = new HashSet();
		
//		System.out.println(langs.add("Java"));  //true
//		System.out.println(langs.add("Python"));  //true
//		System.out.println(langs.add("Java"));   //false
		
		boolean flag=false;
		
		for(String l:arr)
		{
			if(langs.add(l)==false)
			{
				System.out.println("Found Duplicate element..." +l);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("Not found Duplicates");
		}
	}

}
