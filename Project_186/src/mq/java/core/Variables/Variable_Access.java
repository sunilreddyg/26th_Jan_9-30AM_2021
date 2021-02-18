package mq.java.core.Variables;

public class Variable_Access 
{
	
	static int a=100;		//static variable
	int b=200;				//Instant variable
		
	void method1()
	{
		//static variables can access at non-static method without help of classname
		System.out.println(a);
		System.out.println(b);
	}
	
	
	static void method2()
	{
		System.out.println(a);
		System.out.println(new Variable_Access().b);
		//Non static variable to access inside static method we should create object
	}

}
