package capture_screen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_Capture {

	public static void main(String[] args) throws Exception 
	{
		

		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");		
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		
		//Takescreen and convert into output file
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.createDir(new File("D:\\MyprojectA\\Screens"));
		FileHandler.copy(src, new File("D:\\MyprojectA\\Screens\\image.png"));
		System.out.println("Folder and file created");
		
		/*
		 * Disadvantages:-->
		 * 		1. Capture only Top Interface of page 
		 * 				[In Selenium 4 it capture entire interface of page]
		 * 		2. It override exisitng image
		 * 		3. Can't capture screen when alert presentd at webpage
		 */
		
		
		
		
		

	}

}
