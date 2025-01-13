package CollectionDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		
		HashSet myset=new HashSet();
		
		//Set myset=new HashSet();
		
		//HashSet <String> myset=new HashSet<String>();
		
		myset.add(100);
		myset.add(100);
		myset.add(10.5);
		myset.add("Welcome");
		myset.add(true);
		myset.add(null);
		myset.add(null);
		
		System.out.println(myset);
		
		System.out.println(myset.size());
		
		myset.remove(10.5);		//specify value directly not index as in Arraylist
		System.out.println("After removing value>>" +myset);
		
		ArrayList al=new ArrayList(myset);
		System.out.println(al);
		System.out.println(al.get(2));
		
		/*
		for(Object x:myset)
		{
			System.out.println(x);
		}
		*/
		
		Iterator <Object> it=myset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		myset.clear();
		
		System.out.println(myset.isEmpty());
	}

}
