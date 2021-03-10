package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_Number_Of_Windows 
{

	public static void main(String[] args) 
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();					
		driver.get("https://facebook.com");
		driver.manage().window().maximize(); 
	
		
		//Click Instagram hyper link [This link open page in new window]
		driver.findElement(By.linkText("Instagram")).click();
		
		//Wait until New window opened
		new WebDriverWait(driver, 30).until(ExpectedConditions.numberOfWindowsToBe(3));
		System.out.println("Second window opened as expected");
		
		

	}

}
