package mq.java.core.Collections;

import java.util.HashSet;
import java.util.Set;

public class Set_InterFace_HashSet {

	public static void main(String[] args) 
	{
		
		
		Set<String> set=new HashSet<String>();
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
		
		

	}

}
