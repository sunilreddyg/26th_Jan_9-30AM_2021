package mq.java.core.Loops;

import java.util.HashSet;
import java.util.Set;

public class Foreach_Loop {

	public static void main(String[] args) 
	{
		
		//Array values to iterate using for-each
		String tools[]= {"IDE","RC","WD","GRID"};
		for (String string : tools)
		{
			System.out.println(string);
		}
		
		
		//Manual Increment
		int count=0;
		for (String string : tools)
		{
			if(count==3)
			{
				System.out.println(string);
			}
			count=count+1;
			
		}
		
		
		
		
		
		//Integer dynamic value
		int num[]={100,200,300,400};
		for (int i : num)
		{
			System.out.println(i);
		}
		
		
		/*
		 * Set:-->
		 * 			=> Set is a unorder collection framework, it doesn't
		 * 				accept duplicate values to store.
		 */
		
		Set<String> col=new HashSet<String>();
		col.add("IDE");
		col.add("RC");
		col.add("GRID");
		col.add("WD");
		
		for (String string : col) 
		{
			System.out.println(string);
		}
		
		
		
		

	}

}
