package mq.java.core.Loops;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_Links {

	public static void main(String[] args) throws Exception 
	{
		

		//Set Runtime environment variable for chrome driver
		String chrome_path="Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
				
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		String links[]={"Sign Up","Log In","Messenger","People"
				,"Pages","Games","Terms","Services","Careers","Cookies","Developers"};
		
		//Iterate for number of links..
		for (int i = 10; i < links.length; i++) 
		{
			driver.findElement(By.linkText(links[i])).click();
			
			Thread.sleep(3000);
			System.out.println(links[i]+"===> "+driver.getTitle());
			
			//Caputure screen
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("screens\\"+links[i]+".png"));
	
			driver.navigate().back();
			Thread.sleep(3000);
		}
		
		
		
		
		
		
		
		
		
	}

}
