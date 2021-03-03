package interactions.keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown_and_KeyUp_Actions {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		WebElement DemoFrame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(DemoFrame);
		
		//Press Control down at keyboard
		new Actions(driver).keyDown(Keys.CONTROL).perform();
		
		
		driver.findElement(By.xpath("//li[contains(.,'Item 1')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 3')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 5')]")).click();
		
		//Release keydown command
		new Actions(driver).keyUp(Keys.CONTROL).perform();
	}

}
