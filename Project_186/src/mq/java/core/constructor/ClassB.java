package mq.java.core.constructor;

public class ClassB 
{
	//This is constructor/Instance of class
	public ClassB()
	{
		System.out.println("Start Robot");
	}
	
	//Instace methods
	public void walk()
	{
		System.out.println("Walk executed");
	}
	
	//Instance Methods
	public void playMusic()
	{
		System.out.println("Play Music");
	}
	
	public static void main(String args[])
	{
		//Inorder to call Constrcutor we follow <--new---> keyword
		//Inoder to call method using constructor we follow  [.Dot] operator
		new ClassB();
		new ClassB().walk();
		new ClassB().playMusic();
		
		System.out.println("\n");  //It print new line at console
		
		
		//Create object for class using reference variable
		ClassB obj=new ClassB();
		obj.walk();
		obj.playMusic();
		
		/*
		 * Object Creation syntax for class:-->
		 * 	ClassName obj=new Classname();
		 * 	obj.methodname();
		 */
		
	}

}
