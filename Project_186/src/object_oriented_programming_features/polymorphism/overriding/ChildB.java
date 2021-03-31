package object_oriented_programming_features.polymorphism.overriding;

public class ChildB extends Parent
{

	@Override
	void run(int KMPS)
	{
		super.run(20);
		System.out.println("Running in 10 km speed");
	}
	
	public static void main(String args[])
	{
		Parent obj=new ChildB();
		obj.run(10);
	}

	
	
}
