package mq.java.core.Variables;

public class Run_Global_Variables {

	public static void main(String[] args) 
	{
		
		/*
		 * Get Other class public variables..
		 * 	Note:--> Every varaible is return type and return value according to datatypes.
		 */
		
		/*
		 * Calling Instant variables.
		 * 		ClassName obj=new Classname();
		 * 		datatype var=obj.Variablename;
		 */
		Global_Variables obj=new Global_Variables();
		int x=obj.a;
		System.out.println(x);
		String y=obj.name;
		System.out.println(y);
		
		
		/*
		 * Calling static variables
		 * 			datatype var=Classname.Variablename():
		 */
		String My_email=Global_Variables.email;
		System.out.println(My_email);
		
		double Fee=Global_Variables.course_fee;
		System.out.println(Fee);
		
		
	}

}
