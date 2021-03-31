package object_oriented_programming_features.interfaces;

public class ChildA implements Parent,ParentB
{

	@Override
	public void method1() {
		System.out.println("method1 from childA");
		
	}

	@Override
	public void method2() {
		System.out.println("Method2 from childA");
		System.out.println(name);
		
	}

	@Override
	public void method3() {
		System.out.println("Method3 from childA");
		
	}

	@Override
	public void method4()
	{
		System.out.println("Method4 from childA");
		
	}
	

}
