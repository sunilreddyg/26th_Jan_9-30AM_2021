package mq.java.core.Variables.Global_Variables;

public class Get_Global_Variables 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Get Instant Variable from public class.
		 */
		Global_Variables obj=new Global_Variables();
		String Iname=obj.name;
		System.out.println(Iname);
		
		int IAge=obj.Age;
		System.out.println(IAge);
		
		//Calling Instant method
		obj.Get_Details();
		
		//Get  Static variabels
		double Cprice=Global_Variables.Course_fee;
		System.out.println(Cprice);
		
		//Get Static method 
		Global_Variables.Apply_Job();

	}

}
