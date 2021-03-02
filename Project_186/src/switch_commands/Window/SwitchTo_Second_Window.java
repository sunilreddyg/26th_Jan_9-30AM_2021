package switch_commands.Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Second_Window {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.cleartrip.com/trains");
	    driver.manage().window().maximize();
	    
	    String Main_Window_ID=driver.getWindowHandle();
	    System.out.println("Dynamic Window Id --> "+Main_Window_ID);
	    
	    WebElement Cancel_Train_Ticker_link=driver.findElement(By.xpath("//a[contains(@href,'cancellation.shtml#cancel')]"));
	    Cancel_Train_Ticker_link.click();
	    
	    
	    //Get All Dynamic Windows
	    Set<String> AllWindowsIDs=driver.getWindowHandles();
	    //Apply foreach loop to iterate for number of windows
	    for (String EachwidnowID : AllWindowsIDs) 
	    {
	    	//Accept condition when Eachwindow window id mismatch with mainwindowId
			if(!EachwidnowID.equals(Main_Window_ID))
			{
				driver.switchTo().window(EachwidnowID);
				System.out.println("now controls available at sub window");
			}
		}
	    
	    System.out.println("Current fouces window title is ----> "+driver.getTitle());
	    
	    
	}

}
