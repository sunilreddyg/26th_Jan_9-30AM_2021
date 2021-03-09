package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Verify_Title_Present {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");  //Load webpage
		driver.manage().window().maximize();    //maximize browser window
		System.out.println("browser is up and ready to use");	
		
		
		WebDriverWait wait=new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.titleIs("Outlook – free personal email and calendar from Microsoft"));
		System.out.println("Outlook homepage Title Verified");
		
		
		try {
			
			wait.until(ExpectedConditions.titleContains("Sign in to your Microsoft account"));
			System.out.println("Login page title verified");
			
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
