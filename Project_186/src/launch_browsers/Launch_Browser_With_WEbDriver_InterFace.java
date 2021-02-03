package launch_browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser_With_WEbDriver_InterFace {

	public static void main(String[] args) 
	{
	
		//Set runtime environment variable for chrome driver
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		//launch chrome browser
		WebDriver driver=new ChromeDriver();
		//Load webpage to browser window
		driver.get("https://www.facebook.com/r.php");
		//maximize browser [optional]
		driver.manage().window().maximize();
		
		//Print title of page
		System.out.println(driver.getTitle());
		
		
		driver.findElement(By.id("u_0_n")).sendKeys("newuser");
		driver.findElement(By.id("u_0_p")).sendKeys("webdriver");
		//Closing automation browser window.
		//driver.close();

	}

}
