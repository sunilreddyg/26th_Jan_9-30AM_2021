package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.outlook.com");  //Load webpage
		driver.manage().window().maximize();    //maximize browser window
		System.out.println("browser is up and ready to use");						
	
		long Start_time=System.currentTimeMillis();
		try {
			driver.findElement(By.id("email"));
			System.out.println("Element IDentified");
			System.out.println("Element Identified in milliseconds "+(Start_time-System.currentTimeMillis()));
			
			driver.findElement(By.xpath("//input[@name='firstname']"));
			System.out.println("Element Identified in milliseconds "+(Start_time-System.currentTimeMillis()));
			
		} catch (Exception e) {
			System.out.println("Element not Identified");
			e.printStackTrace();
			System.out.println("Exception throwed in milliseconds "+(Start_time-System.currentTimeMillis()));
		}
		
		
		
		
		
	}

}
