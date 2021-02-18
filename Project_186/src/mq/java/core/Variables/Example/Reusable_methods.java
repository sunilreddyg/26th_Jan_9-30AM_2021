package mq.java.core.Variables.Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Reusable_methods 
{
	WebDriver driver=null;
	String browsername=null;
	String Driver_path=null;
	String url=null;
	String username=null;
	String password=null;
	
	public void Launch_browser()
	{
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", Driver_path+"chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", Driver_path+"geckodriver.exe");
			driver=new FirefoxDriver();
		}
	}
	
	
	public void load_webpage()
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void User_login()
	{
		driver.findElement(Reusable_Objects.Singin_email).sendKeys(username);
		driver.findElement(Reusable_Objects.Singin_password).sendKeys(password);
		driver.findElement(Reusable_Objects.Signin_btn).click();
	}
	
	

}
