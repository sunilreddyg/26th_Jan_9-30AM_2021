package javascript_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Examples 
{

	public static void main(String[] args) throws Exception
	{
		
		
		//Set Runtime environment variable for chrome driver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Create Interface for JsExecutor
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//return current window title
		String Runtime_title=js.executeScript("return document.title").toString();
		System.out.println("Current page title is => "+driver.getTitle());
		
		//return current window URL
		String Runtime_url=js.executeScript("return window.location.href").toString();
		System.out.println("Current window title is => "+Runtime_url);
		Thread.sleep(5000);
		
		//return current window URL
		String Runtime_browser_protocol=js.executeScript("return window.location.protocol").toString();
		System.out.println("Current browser protocol is  => "+Runtime_browser_protocol);
		Thread.sleep(5000);
	
	
		//Create popup using javascript
		js.executeScript("return alert('Tc001 Execution finished')");
			
		
		
		

	}

}
