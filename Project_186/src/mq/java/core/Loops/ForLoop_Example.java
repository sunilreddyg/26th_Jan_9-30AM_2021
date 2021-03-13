package mq.java.core.Loops;

public class ForLoop_Example {

	public static void main(String[] args) 
	{
		
		
		//print numbers from 1 to 10
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(i);
		}
		
		
		//Print numbers from 10 to 1
		for (int i = 10; i >=1; i--) 
		{
			System.out.println(i);
		}
		
		//Break loop On Condition
		for (int i = 1; i <=10; i++) 
		{
			
			if(i==5)
			{
				break;  //Stop Iteration once it reach 5 value
			}
			System.out.println(i);
		}
		

		//Continue Iteration on Condition
		for (int i = 100; i <=105; i++) 
		{
			if(i==101 ||  i==104)
			{
				continue;   //Stop Current Iteration and Continue to Next iteration
			}
			System.out.println(i);
		}
		
		
		//Conduct sum between 1 to 100 numbers
		int sum=0;
		for (int i = 1; i <= 100; i++) 
		{
			sum=sum+i;
		}
		System.out.println("total sum value is -->"+sum);
		
		
		//How to Reverse a String
		String Toolname="WebDriver";
		for (int i = Toolname.length()-1; i >= 0 ; i--) 
		{
			char ch[]=Toolname.toCharArray();
			System.out.print(ch[i]);
		}
		
		
		//Print all array value using increment
		String Phones[]= {"OnePlus","Samsung","Vivo","Mi","BlackBerry","Sony"};
		for (int i = 0; i < Phones.length; i++) 
		{
			System.out.println(Phones[i]);
		}
		

	}

}
