package capture_screen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.python.modules.thread.thread;

public class Capture_Screen_At_Required_Location {

	public static void main(String[] args) throws Exception
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");		
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		
		
		WebElement Job_Gallery=driver.findElement(By.xpath("//h2[contains(.,'Job Gallery')]"));
		new Actions(driver).moveToElement(Job_Gallery).perform();
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		
		//Takescreen and convert into output file
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.createDir(new File("D:\\MyprojectA\\Screens"));
		FileHandler.copy(src, new File("D:\\MyprojectA\\Screens\\image.png"));
		System.out.println("Folder and file created");
		
		

	}

}
