package selenium.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection_Commands 
{

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		//Selecting dropdown option using Option Text
		new Select(driver.findElement(By.id("customState")))
		.selectByVisibleText("Andhra Pradesh");
		Thread.sleep(5000);
		
		//Selecting dropdown otpion using value property
		new Select(driver.findElement(By.id("customCity")))
		.selectByValue("ananthapur");
		
		//Typing text into editbox
		driver.findElement(By.id("customLocality")).sendKeys("Gandhi nagar");
		
		//Selecting dropdown option using Index number
		new Select(driver.findElement(By.id("customRadius")))
		.selectByIndex(4);
		
		/*
		 * Note:--> Dropdown also can selected using Click Method.
		 * 				1. Identify Option under select tag 
		 * 				2. Copy Xpath of Option
		 * 				3. Identify with webdriver and perform click
		 * 
		 * Dropdowns also can select using Keyboard shortcuts:-->
		 * 				Note:--> When keyboard shortcut fail it doesn't report with excaption
		 */
		driver.findElement(By.xpath("//option[@value='13'][contains(.,'- 13 KM -')]")).click();
		
		
		/*
		 * Selecting Checkbox:-->
		 * 			In Webdriver selection of checkbox and deselection checkox box 
		 * 			we follow  click Method.
		 */
		driver.findElement(By.id("amenity_category_order_types50")).click();
		driver.findElement(By.id("amenity_service_types52")).click();
		
		//identifying button and click at button
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		
		
	}

}
