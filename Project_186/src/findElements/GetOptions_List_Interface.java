package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions_List_Interface {

	public static void main(String[] args) throws InterruptedException 
	{
		
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.facebook.com/r.php");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Month=driver.findElement(By.id("month"));
	    List<WebElement> AllMonths=new Select(Month).getOptions();
	    AllMonths.remove(0);  
	    System.out.println("Number of Options available --> "+AllMonths.size());
		
	    for (WebElement Eachmonth : AllMonths)
	    {
			System.out.println(Eachmonth.getText());
			Eachmonth.click();
			Thread.sleep(1000);
			
		}
	    
	    
	    WebElement Year=driver.findElement(By.id("year"));
	    //Manage getOptions without using select class
	    List<WebElement> AllOptions=Year.findElements(By.tagName("option"));
	    AllOptions.remove(0);
	    
	    //Using for loop iterate for number of options
	    for (int i = 0; i < AllOptions.size(); i++) 
	    {
			//Get Each option using index number
	    	WebElement EachOption=AllOptions.get(i);
	    	System.out.println(EachOption.getText());
	    	EachOption.click();
	    	Thread.sleep(1000);
		}
		
		

	}

}
