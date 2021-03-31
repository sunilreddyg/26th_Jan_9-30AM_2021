package object_oriented_programming_features.polymorphism.overloading;

public class Overloading 
{
	
	void run(int KMPS)
	{
		System.out.println(KMPS);
	}
	
	void run(String Place)
	{
		System.out.println(Place);
	}
	

	public static void main(String[] args) {
		
		//Create object for Class
		Overloading obj=new Overloading();
		obj.run(10);
		obj.run("Track");

	}

}
