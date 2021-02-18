package mq.java.core.Variables.Global_Variables;

public class Global_Variables
{
	/*
	 * These variable are global variables because it define 
	 * inside class and outside method
	 * 
	 */
	String name="MQ-DSNR";     //Instant variables access outside class with object creation
	public int Age=20;			
	static double Course_fee=12000.00;  //Static variables access without object creation
	

	//Instant method from public class
	public void Get_Details()
	{
		System.out.println("Course details printed");
	}
	
	//Static Method 
	public static void Apply_Job()
	{
		System.out.println("Job applyed");
	}

}
