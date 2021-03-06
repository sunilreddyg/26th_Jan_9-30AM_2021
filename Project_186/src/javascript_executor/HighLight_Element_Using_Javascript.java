package javascript_executor;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class HighLight_Element_Using_Javascript {

	public static void main(String[] args) throws Exception 
	{
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	    
	    
	    
	    
  		//Create Interface for JsExecutor
  		JavascriptExecutor js=((JavascriptExecutor)driver);
  		
  		//Identify element using xpath
  		WebElement Forgot_password_link=driver.findElement(By.xpath("//a[contains(.,'Forgotten password?')]"));
    
  		//Highlight text using jsexecutor
  		js.executeScript("arguments[0].style.backgroundColor='yellow'",Forgot_password_link);
  		
  		//Set outline for text
  		js.executeScript("arguments[0].style.outline ='red solid 2px'",Forgot_password_link);
  		Thread.sleep(5000);
    
	    
	    
	    //CaptureScreenshot and Convert into file format
	    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    //Dump screen into location utilitites
	   FileUtils.copyFile(src, new File("screens\\image.png"));
	    
	    
	    
	    

	}

}
