package waitcommands;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Manage_Timegap_Using_FluentWait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		/*
		 * What is fluent wait?
		 * 		Fluent wait is used to manage frequent tiem gaps
		 * What is the difference between explicit and fluentwait?
		 * 		In fluent wait  we can manage dynamic time gap to load object
		 * 		at webpage and also it allow to define polling seconds and Exception
		 * 		along with time gap.
		 * 
		 */
		
		  // Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		  //Condition alos ignore exception
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(30))
		       .pollingEvery(Duration.ofSeconds(5))
		       .ignoring(NoSuchElementException.class,ElementNotVisibleException.class);
		   
		   long Start_time=System.currentTimeMillis();
		   WebElement Email = wait.until(new Function<WebDriver, WebElement>() 
		   {
			     public WebElement apply(WebDriver driver) 
			     {
			       return driver.findElement(By.id("email"));
			     }
		   }
		   );
		   System.out.println(System.currentTimeMillis()-Start_time);
		   
		
		   Email.clear();
		   Email.sendKeys("Hello123456");
	}

}
