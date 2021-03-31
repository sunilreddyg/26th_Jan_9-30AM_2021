package simple_webdriver_project;

import com.sun.jna.platform.win32.Ddeml.DDEML_MSG_HOOK_DATA;

public class Testcases  extends Reusable_Keywords implements CommonInput,CommonObjects 
{
	
	public void Initiate_browser()
	{
		Launch_Browser(BROWSERNAME);
		Load_Webpage(URL);
		Set_implicit_Wait(10);
		set_explicit_wait(20);
	}
	
	
	public void User_Registration()
	{
		Enter_text(FIRSTNAME_LOC, FIRSTNAME_IP);
		Enter_text(LASTNAME_LOC, LASTNAME_IP);
		select_dropdown("visibletext", DAY_DD_LOC, DAY_DD_IP);
	}
	
	
	public static void main(String args[])
	{
		//Create object for Testcase
		Testcases obj=new Testcases();
		obj.Initiate_browser();
		obj.User_Registration();
	}

}
