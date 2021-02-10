package object_identification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDentificaiton_With_Class_Property {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.com");
		driver.manage().window().maximize();
		
	
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.className("form-control")).clear();
		driver.findElement(By.className("form-control")).sendKeys("sunilreddy.gajjala@outlook.com");
		Thread.sleep(2000);
		
		driver.findElement(By.className("ext-primary")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("ext-text-box")).clear();
		driver.findElement(By.className("ext-text-box")).sendKeys("Hello123456");
		Thread.sleep(2000);
		
		driver.findElement(By.className("ext-primary")).click();
		
		
		/*
		 * Working with Class Identifier:-->
		 * 		=> Check duplication of class before use
		 * 		=> Don't use class property value along with spaces
		 * 		=> because developer user spaces with in class to define
		 * 				multiple class properties..
		 * 
		 *  for Example:-->
		 *  		<div  class="navigation  Signin_link">
		 *  
		 *  			By.className("navigation Signin_link")   ----> Wrong
		 *  			
		 *  			By.className("navigation")
		 *  					[OR]
		 *  			By.className("Signin_links")      
		 *  			=> Make sure duplication of class individually before use it..
		 * 		
		 * 			Note:--> While defining class property along with Xpath
		 * 					and cssSelector locators we can include spaces...
		 * 
		 * 				By.xpath("//div[@class='navigation  Signin_link']")
		 * 				By.cssSelector("div[class='navigation Signin_link']")
		 */
		
		
		
		
	}

}
