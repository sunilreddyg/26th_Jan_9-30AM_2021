package selenium.webdriver.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_LinkText_Identifier {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		
		/*
		 * Note:--> To load page webdriver had default timeout,Incase
		 * 			page loading slowly webdriver manage timegap up to 1 minutes
		 */
		
		driver.findElement(By.linkText("People")).click();
		driver.findElement(By.linkText("Pages")).click();
		driver.findElement(By.linkText("Cristiano Ronaldo")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("About")).click();
	}

}
