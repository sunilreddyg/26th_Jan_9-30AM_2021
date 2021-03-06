package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToView {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub//Set Runtime environment variable for chrome driver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
			WebElement Link=driver.findElement(By.xpath("//a[@title='Sign up for Facebook']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",Link);
		
			
			((JavascriptExecutor)driver).executeScript("window.scrollTo(0, 0);");
		
			//To scroll window vertical.
		   ((JavascriptExecutor)driver).executeScript("window.scroll(100,600)");
		   Thread.sleep(4000);
		   
		   //To Scroll horizonal.
		   ((JavascriptExecutor)driver).executeScript("window.scroll(300,100)");
	}

}
