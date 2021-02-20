package mq.java.core.conditions;

public class Switch_case {

	public static void main(String[] args) {
	
		/*
		 * Switchcase:-->
		 * 		Multy decison statement work similar as
		 * 		else-if condition only difference is
		 * 		it will target Direct case instead of 
		 * 		verifying each and every decision
		 */
		
		String month="mar";
		
		switch (month) 
		{
		case "jan":
			System.out.println("discount 10%");
			break;
			
		case "feb":
			System.out.println("discount 20%");
			break;
			
		case "mar":
			System.out.println("discount 30%");
			break;
			
		case "apr":
			System.out.println("No discount");
			break;

		default:System.out.println("Month name mismatch");
			break;
		}
		
		
		

	}

}
