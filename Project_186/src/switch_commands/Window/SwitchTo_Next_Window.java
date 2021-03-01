package switch_commands.Window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Next_Window {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.facebook.com/r.php");
	    driver.manage().window().maximize();
	    
	    String MainWindowID=driver.getWindowHandle();
	    System.out.println(MainWindowID);
	    
	    //This Link open in a newtab/window
	    WebElement Instagram_link=driver.findElement(By.linkText("Instagram"));
	    Instagram_link.click();
	    
	    //Get all dynamic windows id's [Set is a unorder collection of object]
	   Set<String> All_windowIDS= driver.getWindowHandles();
	   //Convert all Set of string into iterators
	   Iterator<String> itr=All_windowIDS.iterator();
	    //Get Each iterator using Next Keyword
	   String W1=itr.next();
	   String W2=itr.next();
	   
	   driver.switchTo().window(W2);
	    System.out.println("W2 title is ---> "+driver.getTitle());
	    
	    driver.switchTo().window(W1);
	    System.out.println("W1 title is ---> "+driver.getTitle());
	    
	}

}
