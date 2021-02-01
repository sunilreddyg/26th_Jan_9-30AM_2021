package mq.java.core.methods;


public class RobotA 
{
	
	public  void run()
	{
		System.out.println("run fininshed");
	}
	
	public void walk()
	{
		System.out.println("walk finished");
	}
	
	public static void main(String args[])
	{
			RobotA obj=new RobotA();
			obj.walk();
			obj.run();
	}
	
}
