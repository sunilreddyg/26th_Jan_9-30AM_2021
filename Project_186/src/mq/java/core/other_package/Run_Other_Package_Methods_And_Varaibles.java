package mq.java.core.other_package;



import mq.java.core.Variables.Global_Variables;
import mq.java.core.methods.RobotA;
import mq.java.core.static_methods.InputDevices;


public class Run_Other_Package_Methods_And_Varaibles 
{
	public static void main(String[] args) 
	{
	
		/*
		 * Rule1=> Only public modifer methods and variables
		 * 			can access outside package.
		 * Rule2=> We have to import other package classes
		 * 			into current class inorder to get outside
		 * 			package methods and classes.
		 */
		RobotA obj=new RobotA();
		obj.walk();
		
		InputDevices.KeyBoard();
		
		String x=Global_Variables.email;
		System.out.println(x);
		
		new Global_Variables().method1();
		
	}

}
