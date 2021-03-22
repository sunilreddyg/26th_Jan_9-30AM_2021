package pagefactory.Without_PageFactory;

import org.openqa.selenium.By;

public class Login_page
{
	

	public static By Singin_email=By.xpath("//input[@id='email']");
	public static By Singin_password=By.xpath("//input[contains(@data-testid,'royal_pass')]");
	public static By Signin_btn=By.xpath("//button[@data-testid='royal_login_button']");
	public static By Login_page_header_location=By.xpath("//h2[contains(.,'Facebook helps you connect and share with the people in your life.')]");
	
	//Page title & headers
	public static String Login_page_title="Facebook – log in or sign up";
	public static String Login_page_header="Facebook helps you connect and share with the people in your life.";
	
	//InputData
	public static String UID="darshan";
	
}
