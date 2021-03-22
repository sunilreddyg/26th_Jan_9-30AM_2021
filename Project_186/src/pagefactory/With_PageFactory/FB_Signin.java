package pagefactory.With_PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FB_Signin 
{

	
	@FindBy(id="email") 
	public WebElement Email_EB;
	
	@FindBy(xpath="//input[@data-testid='royal_pass']")
	public WebElement Password_EB;
	
	@FindBy(xpath = "//button[@name='login']")
	public WebElement Login_Btn;
	

	//InputData
	public String UID="darshan";
	public String PWD="Hello";
	
	
	/*
	 *Method_Reusable login
	 */
	public void user_login_Invalid_pwd()
	{
		Email_EB.clear();
		Email_EB.sendKeys(UID);
		
		Password_EB.clear();
		Password_EB.sendKeys(PWD);
		
		Login_Btn.click();
	}
	
	public void user_login_valid_pwd()
	{
		Email_EB.clear();
		Email_EB.sendKeys(UID);
		
		Password_EB.clear();
		Password_EB.sendKeys(PWD);
		
		Login_Btn.click();
	}
	
	
	
	
}
