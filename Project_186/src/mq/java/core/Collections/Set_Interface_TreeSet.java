package mq.java.core.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set_Interface_TreeSet {

	public static void main(String[] args) {
		
	
		
		Set<String> set=new TreeSet<String>();
		set.add("OnePlus");
		set.add("Samsung");
		set.add("Vivo");
		set.add("Oppo");
		set.add("LG");
		set.add("Samsung");
		
		//Remove any object using name
		set.remove("Vivo");
		
		//Get Size of Object
		int Obj_count=set.size();
		System.out.println("Number of objects available is --> "+Obj_count);
		
		//Verify Object Contains at Collection
		boolean flag=set.contains("Vivo");
		System.out.println("Oject Contains status is ---> "+flag);
		
		//Get First Iterator object
		String Itr=set.iterator().next();
		System.out.println("First iterator value is ---> "+Itr);
		
		//Get Collection Empty status
		boolean flag1=set.isEmpty();
		System.out.println("Collection Empty status is ---> "+flag1);
		
	
		//using foreach loop read all object from Collection
		for (String eachobject : set) 
		{
			System.out.println("=>"+eachobject);
		}
		
		//Print new line in console
		System.out.println("\n");
		
		
		
		//Conver all set of object into iterator of strings
		Iterator<String> tokens=set.iterator();
		//using Conditional loop read all objects until it has next object
		while(tokens.hasNext())
		{
			System.out.println("#"+tokens.next());
		}
		
		
		System.out.println("\n");
		
		//Convert all Set Interface collections into list
		List<String> list=new ArrayList<String>(set);
		//Get single object using index number 
		System.out.println(list.get(2));
		
		for (String string : list) 
		{
			System.out.println("*"+string);
			
		}
		

	}

}
