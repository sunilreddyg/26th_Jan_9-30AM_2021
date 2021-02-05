package selenium.webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_KeyBoard_Actions {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		
		//Clicing sign in button
		driver.findElement(By.linkText("Sign in")).click();

		//typing username and Press Enter key to submit email
		driver.findElement(By.id("i0116"))
		.sendKeys("sunilreddy.gajjala@outlook.com",Keys.ENTER);
		Thread.sleep(5000);
		
		//enter password and press Enter to submit login
		driver.findElement(By.id("i0118")).sendKeys("Hello12345"+Keys.ENTER);
		
	}

}
