package switch_commands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame_Using_Navigation_Command {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    //Navigate to frame using url [We can also use get method]
	    driver.navigate().to("https://www.cleartrip.com/signinstatic/tripidlogin.shtml?popup=no&guest=true");
	    
	    
	    WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	    email.clear();
	    email.sendKeys("darshan@123");
	    
	    WebElement TripId=driver.findElement(By.xpath("//input[@id='tripidSecond']"));
	    TripId.clear();
	    TripId.sendKeys("4646465654");
	    
	    
	    //Navigate back to mainpage from frame
	    driver.navigate().back();
	    
	}

}
