package interactions.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_DropBy 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");    
		//browser initiation command
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.hdfcbank.com/personal/tools-and-calculators/personal-loan-calculator");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement Scroller1=driver.findElement(By.xpath("//div[@class='rangeslider__handle']"));
		
		//Performing drag and drop using coordinates.
		new Actions(driver).dragAndDropBy(Scroller1, 100, 0).perform();
		Thread.sleep(2000);
		
		
		WebElement Scroller2=driver.findElement(By.xpath("(//div[@class='rangeslider__handle'])[2]"));
		//Performing drag and drop using coordinates.
		new Actions(driver).dragAndDropBy(Scroller2, -50, 0).perform();
				
		

	}

}
