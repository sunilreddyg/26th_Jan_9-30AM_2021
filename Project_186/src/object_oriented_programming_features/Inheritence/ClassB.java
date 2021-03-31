package object_oriented_programming_features.Inheritence;

public class ClassB extends ClassA
{
	
	public void method2()
	{
		method1();				  //method from classA
		System.out.println(name); //Variable From classA
	}
	
	
	public static void main(String args[])
	{
		//Create object to access only parent class methods and variables
		ClassA obj=new ClassB();
		obj.method1();
		System.out.println(obj.name);
		
		//Create object to access Parent and Child class methods
		ClassB ref=new ClassB();
		ref.method1();  //ClassA
		ref.method2();  //ClassB
		System.out.println(ref.name); //ClassA

	}
}
