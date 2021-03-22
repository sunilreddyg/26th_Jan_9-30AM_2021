package pagefactory.Without_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_Login_PageObjects {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		boolean flag=driver.getTitle().equals(Login_page.Login_page_title);
		if(flag==true)
		{
			driver.findElement(Login_page.Singin_email).clear();
			driver.findElement(Login_page.Singin_email).sendKeys(Login_page.UID);
		}
		else
		{
			System.out.println("title mismatch");
		}

	}

}
