package mq.java.core.Arrays;

public class String_Comparision_Split_Function {

	public static void main(String[] args)
	{
		
		String email="sunilreddy@mindqsystems.com";
		
		//using split method Split string with help of any delimeter
		String arr[]=email.split("@");
		System.out.println("Length of array is ---> "+arr.length);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		
		String toolname="WEBDRIVER";
		char ch[]=toolname.toCharArray();
		System.out.println(ch[3]);
	}

}
