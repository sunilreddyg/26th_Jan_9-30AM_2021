package mq.java.core.conditions;

public class Nested_if_Condition {

	public static void main(String[] args) 
	{
		
		/*
		 * NestedIf:-->
		 * 		Child condition under parent condition
		 */
		
		int Age=19;
		String Smoker="yes";
		//Parent condition
		if(Age >18)
		{
			System.out.println("Accepted Insurance");
			//Nested Condition  [Child Condition]
			if(Smoker.equals("yes"))
			{
				System.out.println("Rejected Insurance, Cause is Smoker");
			}
		}
		else
		{
			System.out.println("Rejected Insurance due to age shortage");
		}
		

	}

}
