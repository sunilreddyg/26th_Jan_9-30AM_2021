package mq.java.core.Variables;

public class Variable_Types 
{
	String username="Arjun";   			//Instant variable 
	static String password="12345";     //Class Variable
	
	final String AccessCode="10001";
	
	
	public void method1()
	{
		String name="MQ";   //Local Variable [Because it declared inside method]
		System.out.println(name);
	}
	
	public void method2()
	{
		//Printing global variables..
		System.out.println("Instant Varaible is =>"+username);
		System.out.println("Class Varaible is => "+password);
	}
	
	public static void method3()
	{
		//Static Methods or variables we can call directly
		System.out.println("static variable is => "+password);
		
		//Otherthan static variables to call we must create object
		String UID=new Variable_Types().username;
		System.out.println("Call Instant from statis is => "+UID);
	}
	
	

	public static void main(String[] args) 
	{
		
		//Calling Instant methods
		Variable_Types obj=new Variable_Types();
		obj.method1();
		obj.method2();
		
		//Global variables accept runtime changes
		String uid=obj.username="Vihar";
		System.out.println("After changes username is -->"+uid);
		
		String pwd=Variable_Types.password="hello123456789";
		System.out.println("After changes password is --->"+pwd);
		
		//We cant change final variable at runtime
		String Acs=obj.AccessCode;
		System.out.println(Acs);
		
		//Calling Class Method
		method3();
		
		
		

	}

}
