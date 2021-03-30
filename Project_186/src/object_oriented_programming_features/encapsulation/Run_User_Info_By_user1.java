package object_oriented_programming_features.encapsulation;


public class Run_User_Info_By_user1 {

	public static void main(String[] args) 
	{
		
		
		//Create object for class
		User_Info obj=new User_Info();
		obj.EmpID="MQE002";
		System.out.println("update employee id-->"+obj.EmpID);

		//Initilize data to Varaible using method
		obj.set_name("Vijay");
		obj.set_email("info.viajay@gmail.com");
		
		
		String Rname=obj.get_name();
		System.out.println(Rname);
		
		String Remail=obj.get_email();
		System.out.println(Remail);
	}

}
