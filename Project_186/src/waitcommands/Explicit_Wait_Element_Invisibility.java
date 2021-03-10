package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_Element_Invisibility 
{

	public static void main(String[] args) 
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://www.cleartrip.com");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		
		
		//Enable Explicit time at automation browser window
		WebDriverWait wait=new WebDriverWait(driver, 50);
	
		//target more options link
		WebElement More_options=driver.findElement(By.xpath("//a[@id='MoreOptionsLink']"));
		
		/*
		 * Click More options. Expected "Class of travel" and "Preffered
		 * airlines" element should visible at webpage..
		 */
		More_options.click();
		
		
		By Class_of_travel_locator=By.xpath("//select[@id='Class']");
		WebElement Class_of_Travel_Element=driver.findElement(Class_of_travel_locator);
		
		//use webelement Interface as argument
		wait.until(ExpectedConditions.visibilityOf(Class_of_Travel_Element));
		System.out.println("Object visible at webapge");
		
		//Use by class as argument
		wait.until(ExpectedConditions.visibilityOfElementLocated(Class_of_travel_locator));
		System.out.println("Object visibility at webpage");
	}

}
