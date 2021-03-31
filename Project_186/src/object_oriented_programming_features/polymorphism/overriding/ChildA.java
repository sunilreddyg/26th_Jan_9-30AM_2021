package object_oriented_programming_features.polymorphism.overriding;

public class ChildA extends Parent
{
	
	@Override
	void run(int KMPS)
	{
		super.run(20);
		System.out.println("Running in 20 Km Speed");
	}
	
	
	public static void main(String args[])
	{
		Parent obj=new ChildA();
		obj.run(10);
	}

}
