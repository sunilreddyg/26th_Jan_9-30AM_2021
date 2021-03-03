package interactions.keyboard;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiple_keyBoard_Actions 
{

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		

		Actions action=new Actions(driver);
		//Select complete text at webpage
		action.keyDown(Keys.CONTROL).sendKeys(Keys.chord("A")).perform();
		
		//Release Control
		action.keyUp(Keys.CONTROL).perform();
		
		//Press Escape key at browser window
		action.sendKeys(Keys.ESCAPE).perform();
		
		
	}

}
