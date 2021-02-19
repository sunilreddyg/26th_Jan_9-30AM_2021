package mq.java.core.Variables;

import net.bytebuddy.implementation.bytecode.StackSize;

public class String_Comparisions {

	public static void main(String[] args) {
		
		/*
		 * String:-->
		 * 			=> String allow set of characters to store
		 * 			=> String is a non primitive datatype
		 * 			=> String is a object type and string also
		 * 				called as class.
		 * 			=> Default value of string is null.
		 */
		
		String name="mq dsnr";
		String mobilenumber="9030248855";
		String email="info.dsnr@mindqsystems.com";
		
		System.out.println(name+"\t"+mobilenumber+"\t"+email);

		
		/*
		 * Equals:-->
		 * 		method verify equal comparision between two strings
		 * 		and return boolean value true/false.
		 * 		=> comparision is case-sensitive
		 */
		String Actual_result="Created Account";
		String Expected_result="created account";
		
		boolean flag=Actual_result.equals(Expected_result);
		System.out.println("Equal comparision is ---> "+flag);
		
		/*
		 * EqualIngoreCase:-->
		 * 			method verify equal comparision of two
		 * 			strings by ignoring casesensitive
		 */
		boolean flag1=Actual_result.equalsIgnoreCase(Expected_result);
		System.out.println("EqualIngore case comparision is ---> "+flag1);
		
		
		/*
		 * Contains:-->
		 * 		Method verify sub sequence charactes available
		 * 		at main string. and return boolean value true/false
		 * 		=> comparision is case-sensitive
		 */
		String Status="Account create 100 Successfull";
		boolean flag2=Status.contains("Successfull");
		System.out.println("Sequence characters avaialble status is ---> "+flag2);
		
		
		/*
		 * SubString:-->
		 * 			get Sub sequent characters from main string
		 * 			method return required characters in string format
		 */
		String Account_num="242458586565";
		String sub=Account_num.substring(4, 8);
		System.out.println("Middle characters are ---> "+sub);
		String Last_digits=Account_num.substring(8);
		System.out.println("Last digits are ---> "+Last_digits);
		
		
		
		/*
		 * length:-->
		 * 			Method return number of characters available at string
		 * 			in integer format.
		 */
		String mobile="9030248855";
		int len=mobile.length();
		System.out.println("Mobile number length is ---> "+len);
		
		
		/*
		 * Trim:-->
		 * 		Method trim extra spaces available at string
		 * 		=> It only left and right spaces only
		 */
		String pincode="    500030     ";
		System.out.println("pincode length before trim ---> "+pincode.length());
		String New_pin=pincode.trim();
		System.out.println("Pincode length after trim---> "+New_pin.length());
		
		
		/*
		 * ToUppercase:-->
		 * 			method convert all available lowercase characters into
		 * 			uppercase
		 */
		String zipcode="nnHgKK";
		System.out.println(zipcode.toUpperCase());
		
	
		/*
		 * ToLowercase:-->
		 * 			method convert all available uppercase characters into
		 * 			lowsercase
		 */
		String Code="HDFC";
		System.out.println(Code.toLowerCase());
		
		
		/*
		 * startswith:-->
		 * 			method verify given string starts with
		 * 			expected characters and return boolean 
		 * 			value true/false
		 */
		String IFSC="HDFC000123";
		boolean flag3=IFSC.startsWith("HDFC");
		System.out.println("Code start with Expected characters? --> "+flag3);
		
		/*
		 * endswith:-->
		 * 			method verify given string ends with
		 * 			expected characters and return boolean 
		 * 			value true/false
		 */
		String Emp_id="100MQ";
		boolean flag4=Emp_id.endsWith("MQ");
		System.out.println("is id match with end characters ---> "+flag4);
		
		
		/*
		 * isempty:-->
		 * 		method return characters available status in 
		 * 		boolean format
		 * 		=> Return true when string doesn't have any charactes
		 * 		=> Return false when string has characters
		 */
		String var="";
		String var1="Hello";
		System.out.println("var empty status is ---> "+var.isEmpty());
		System.out.println("Var1 empty statu is ---> "+var1.isEmpty());
		
	
		/*
		 * charsAt:-->
		 * 		Method return single character using index number
		 */
		String browsername="Chrome,Firefox";
		char ch=browsername.charAt(7);
		System.out.println("charcters available at 7th index number ---> "+ch);
		
		/*
		 * replace:-->
		 * 		Replace old characters with New characters 
		 */
		String Rep=browsername.replace('F', 'G');
		System.out.println("After replace character is --> "+Rep);
		
		/*
		 * Concat:-->
		 * 			Add new string to existing charactes
		 */
		String New_browser=browsername.concat(",Safari");
		System.out.println(New_browser);
	}

}
