package switch_commands.Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_BetWeen_Multiple_Window {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		//Capture current Window dynamic id
		String Main_windowID=driver.getWindowHandle();
		System.out.println(Main_windowID);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Rail Tour Packages']")).click();
		Thread.sleep(2000);
		
		
		//Get All Dynamic window ID's  [Set is a unorder coolection of object]
		Set<String> allwindowIDS=driver.getWindowHandles();
		
		//Apply foreach to iterate number of windows
		for (String EachwindowID : allwindowIDS) 
		{
			 driver.switchTo().window(EachwindowID);
			 
			 //Get Each window title at runtime
			 String Runtime_title=driver.getTitle();
			 System.out.println(Runtime_title);
			
			 if(Runtime_title.contains("Cancel Train Bookings"))
			 {
				 break;  //This command break iteration
			 }
			 
		}
		
		
		System.out.println("current Foucsed title is => "+driver.getTitle());
		
		
		
		
		
		

	}

}
