package javascript_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Selection_Using_JavaScript {

	public static void main(String[] args) 
	{
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.facebook.com/r.php");
	    driver.manage().window().maximize();
	    
	    
	    //Enable javascript executor on automation browser
	    JavascriptExecutor js=((JavascriptExecutor)driver);
	    js.executeScript("document.getElementById('day').value='4'");
	    js.executeScript("document.getElementById('month').value='7'");
	    js.executeScript("document.getElementById('year').selectedIndex='7'");
	    
	    

	}

}
