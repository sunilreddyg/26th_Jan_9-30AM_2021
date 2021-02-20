package mq.java.core.conditions;

public class If_Condition {

	public static void main(String[] args) 
	{
		
		/*
		 * What is if statement:-->
		 * 		=>if is single decision statement where
		 * 			it allow perticula line of code to execute
		 * 			on Decision.
		 * 		=> if accept only boolean value for comparision
		 */
		
		
		int Age=19;
		
		if(Age == 18)
		{
			System.out.println("Accepted");
			System.out.println("Continued");
		}
		
		
		if(!(Age==18))  //!--Not
		{
			System.out.println("Rejected");
			System.out.println("Failed");
		}
		
		
		//Single Statement with if condition
		//To Define single statement inside if condition no need to write block.
		if(Age>18)
			System.out.println("Accepted");
			
		
	}

}
