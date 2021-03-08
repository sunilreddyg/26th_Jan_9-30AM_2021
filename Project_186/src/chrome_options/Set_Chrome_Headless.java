package chrome_options;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Set_Chrome_Headless {

	public static void main(String[] args) 
	{
		
		
		ChromeOptions options=new ChromeOptions();
		//options.setHeadless(true);
		options.addArguments("--headless");
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		System.out.println("Browser opened");
		driver.get("http://facebook.com");
		System.out.println("Url Typed");
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("darshan");
		System.out.println("email Entry successfull");
		
		

	}

}
