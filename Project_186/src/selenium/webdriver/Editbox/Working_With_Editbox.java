package selenium.webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Editbox 
{

	public static void main(String[] args) 
	{
	
		//Set Runtime Environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("u_0_n")).clear();
		driver.findElement(By.id("u_0_n")).sendKeys("Newuser");
		
		//Identifying Firstname element and Press TAB keyboard and Typing at Lastname Editbox
		driver.findElement(By.id("u_0_n")).sendKeys(Keys.TAB+"Webdriver");
		
		//Identifying Email Object 
		driver.findElement(By.name("reg_email__"))
		.sendKeys("newuserwebdriver@gmail.com"+Keys.TAB+"newuserwebdriver@gmail.com");
		
		//Pressing two times arrowdown option at dropdown 
		driver.findElement(By.name("birthday_day")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		//Press Character sequences at keyboard
		driver.findElement(By.id("month")).sendKeys("D");
		
		/*
		 * Note:-->
		 * 			This programs are just for understanding purpose
		 * 			Don't use as regular commands
		 * 			In Webdriver to handle every situvation separate commands available
		 * 
		 * 			=> If keyboard shortcut failed webdriver doesn't throw any exception
		 */
		
		
		
		
		
	}

}
