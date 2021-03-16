package mq.java.core.Collections;

import java.util.Hashtable;

public class Map_Interface {

	public static void main(String[] args) 
	{
		
	
		Hashtable<Integer, String> map=new Hashtable<Integer,String>();
		map.put(101, "Samsung");
		map.put(106, "Oppo");
		map.put(104, "Vivo");
		map.put(109, "Apple");
		map.put(119, "OnePlus");
		map.put(129, "Apple");
		
		//Retrive object using keyname
		String Mobile_name=map.get(104);
		System.out.println(Mobile_name);
		
		//Reach hash table object using foreach loop
		for (Integer EachKey : map.keySet()) 
		{
			String KeyValue=map.get(EachKey);
			System.out.println("=> "+KeyValue);
		}
		
		
		
		
		
		

	}

}
