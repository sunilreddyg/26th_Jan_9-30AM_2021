package object_oriented_programming_features.encapsulation;

public class User_Info 
{
	
	//Variable declared with private modifier so that it can't be access from outside class
	private String name;
	private String email;

	
	public String EmpID="MQE001";
	
	//Setter method--->Method initilize data to varaible
	public void set_name(String ename)
	{
		this.name=ename;
		System.out.println("name initiated");
	}
	
	
	//Setter method--->Method initilize data to varaible
	public void set_email(String email)
	{
		this.email=email;
		System.out.println("name initiated");
	}
	
	
	
	
	//Getter method
	public String get_name()
	{
		System.out.println("name accessed");
		return name;
	}
	
	
	
	//Getter method
	public String get_email()
	{
		System.out.println("email accessed");
		return email;
	}
	

}
