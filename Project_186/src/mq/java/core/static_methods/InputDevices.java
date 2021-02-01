package mq.java.core.static_methods;

public class InputDevices 
{
	
	public static void Mouse()
	{
		System.out.println("Mouse connected");
	}
	
	public static void KeyBoard()
	{
		System.out.println("Keyboard connected");
	}

	public static void main(String[] args) 
	{
		  /*
		   * => Becuase main method contains static specifier
		   * 	it allows any static method without object creation.
		   * 		Syntax:-->
		   * 				ClassName.Methodname();
		   * 
		   * 		Note:--> with in a class we can directly
		   * 				method name..
		   */
			Mouse();
			KeyBoard();
	}

}
