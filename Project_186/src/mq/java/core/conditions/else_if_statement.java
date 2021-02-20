package mq.java.core.conditions;

public class else_if_statement {

	public static void main(String[] args) {
		
		
		/*
		 * else-if:-->
		 * 			Multy decison statement
		 */
		
		String browsername="ie";
		
		if(browsername.equals("firefox"))
		{
			System.out.println("firefox browser launched");
		}
		else if(browsername.equals("chrome"))
		{
			System.out.println("chrome browser launched");
		}
		else if(browsername.equals("ie"))
		{
			System.out.println("ie browser launched");
		}
		else
		{
			System.out.println("Browsenrame mismatch");
		}

	}

}
