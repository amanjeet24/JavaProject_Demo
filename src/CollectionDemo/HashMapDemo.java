package CollectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		
		//HashMap hm=new HashMap();
		//Map hm=new HashMap();
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(101, "John");
		hm.put(102, "Marry");
		hm.put(103, "David");
		hm.put(104, "Scott");
		hm.put(102, "Ben");
		
		System.out.println(hm);
		
		System.out.println(hm.size());
		
		hm.remove(103);
		System.out.println("After removing pair..."+hm);
		
		System.out.println(hm.get(102));
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		/*
		for(int k:hm.keySet())
		{
			System.out.println(k+"  "+hm.get(k));
		}
		*/
		
		Iterator <Entry <Integer, String>> it=hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			Entry <Integer, String> entry=it.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		
		hm.clear();
		System.out.println(hm.isEmpty());
	}
	

}
