package mq.java.core.Variables.Example;

public class Run_Reusable_method_By_User2 {

	public static void main(String[] args) 
	{
		Reusable_methods obj=new Reusable_methods();
		obj.browsername="chrome";
		obj.Driver_path="Drivers\\";
		obj.Launch_browser();
		
		obj.url="http://facebook.com";
		obj.load_webpage();
		
		obj.username="8025488552";
		obj.password="x1234567";
		obj.User_login();

	}

}
