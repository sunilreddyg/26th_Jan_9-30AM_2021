package mq.java.core.Variables.Example;

public class Run_Reusable_Methods_By_User1 {

	public static void main(String[] args) 
	{
		
		Reusable_methods obj=new Reusable_methods();
		obj.browsername="firefox";
		obj.Driver_path="Drivers\\";
		obj.Launch_browser();
		
		obj.url="http://facebook.com";
		obj.load_webpage();
		
		obj.username="903024885";
		obj.password="Hello1234";
		obj.User_login();

	}

}
