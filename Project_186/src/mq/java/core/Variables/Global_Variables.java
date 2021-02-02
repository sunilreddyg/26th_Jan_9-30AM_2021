package mq.java.core.Variables;

public class Global_Variables 
{
	
	int a=100;
	String name="mq-dsnr";
	
	public static String email="info.dsnr@gmail.com";  //pulic modifier can access outside package
	public static double course_fee=10000.00;
	
	/*
	 * => Here all variale are global variables because these
	 * 		variables not declared inside method only declare inside a class.
	 */
	
	public void method1()
	{
		System.out.println("Line1");
		System.out.println("Line2");
		System.out.println("Line3");
		System.out.println("Line4");
		System.out.println("Line5");
	}
	
}
