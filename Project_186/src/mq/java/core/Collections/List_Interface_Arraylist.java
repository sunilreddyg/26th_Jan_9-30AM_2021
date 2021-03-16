package mq.java.core.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Interface_Arraylist {

	public static void main(String[] args) 
	{
		
		List<String> list=new ArrayList<String>();
		list.add("OnePlus");
		list.add("Samsung");
		list.add("Vivo");
		list.add("Oppo");
		list.add("LG");
		list.add("Samsung");
		
		//Remove any object using name
		list.remove("Vivo");
		
		//Get Size of Object
		int Obj_count=list.size();
		System.out.println("Number of objects available is --> "+Obj_count);
		
		//Verify Object Contains at Collection
		boolean flag=list.contains("Vivo");
		System.out.println("Oject Contains status is ---> "+flag);
		
		//Get First Iterator object
		String Itr=list.iterator().next();
		System.out.println("First iterator value is ---> "+Itr);
		
		//Get Collection Empty status
		boolean flag1=list.isEmpty();
		System.out.println("Collection Empty status is ---> "+flag1);
		
		//Only list interface have get method to retrieve any object with index number
		String Obj3=list.get(3);
		System.out.println("Under list 3rd inex object is --> "+Obj3);
		
		
		
		//Because it is order list we can read object using for loop
		for (int i = 0; i < list.size(); i++) 
		{
			//Target each object using icrement number
			String Indexobject=list.get(i);
			System.out.println("!-> "+Indexobject);
		}
		
		
	
		//using foreach loop read all object from Collection
		for (String eachobject : list) 
		{
			System.out.println("=>"+eachobject);
		}
		
		//Print new line in console
		System.out.println("\n");
		
		
		
		//Conver all list of object into iterator of strings
		Iterator<String> tokens=list.iterator();
		//using Conditional loop read all objects until it has next object
		while(tokens.hasNext())
		{
			System.out.println("#"+tokens.next());
		}
		
		
		

	}

}
