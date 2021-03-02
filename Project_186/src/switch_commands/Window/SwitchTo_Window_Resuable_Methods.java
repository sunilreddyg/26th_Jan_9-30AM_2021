package switch_commands.Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Window_Resuable_Methods 
{
	
	static WebDriver driver;
	static String Main_Window_ID;
	
	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//Caling reusable method to switch to window
		switchTo_Next_window();
		System.out.println("next window title is ---> "+driver.getTitle());
		
		//Switch Controls back to mainwindow
		driver.switchTo().window(Main_Window_ID);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
						
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		Thread.sleep(2000);
		
		//calling reusable method to switch to window
		switchTo__window_with_title("Cancel Train Bookings");
		System.out.println("Current window title foucused on --> "+driver.getTitle());
		
	}
	
	public static void switchTo_Next_window()
	{
	    Main_Window_ID=driver.getWindowHandle();
	    
	    //Get All Dynamic Windows
	    Set<String> AllWindowsIDs=driver.getWindowHandles();
	    //Apply foreach loop to iterate for number of windows
	    for (String EachwidnowID : AllWindowsIDs) 
	    {
	    	//Accept condition when Eachwindow window id mismatch with mainwindowId
			if(!EachwidnowID.equals(Main_Window_ID))
			{
				driver.switchTo().window(EachwidnowID);
				System.out.println("Now Controls available at Next Window");
			}
		}
	}
	
	public static void switchTo__window_with_title(String Expeced_page_title)
	{
	    String Main_Window_ID=driver.getWindowHandle();
	    
	    //Get All Dynamic Windows
	    Set<String> AllWindowsIDs=driver.getWindowHandles();
	    //Apply foreach loop to iterate for number of windows
	    for (String EachwidnowID : AllWindowsIDs) 
	    {
	   	 driver.switchTo().window(EachwidnowID);
		 
		 //Get Each window title at runtime
		 String Runtime_title=driver.getTitle();
		 System.out.println(Runtime_title);
		
		 if(Runtime_title.contains(Expeced_page_title))
		 {
			 break;  //This command break iteration
		 }
		}
	}


	

}
