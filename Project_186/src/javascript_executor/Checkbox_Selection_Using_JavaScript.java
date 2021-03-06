package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Selection_Using_JavaScript {

	public static void main(String[] args) 
	{
		
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
	    driver.manage().window().maximize();
	    
	    //Enable javascript executor on automation browser
	    JavascriptExecutor js=((JavascriptExecutor)driver);
	    
	    //Select checkbox
	    js.executeScript("document.getElementById('amenity_category_order_types49').checked='checked'");
	    //Select checkbox using click method
	    
	    WebElement CashDepo=driver.findElement(By.xpath("//input[@value='88']"));
	    js.executeScript("arguments[0].click()", CashDepo);
	    
	    
	    
	    
	    
	    //Get Object to Visible
	    js.executeScript("arguments[0].scrollIntoView()", CashDepo);
	    
	    
	    
	    
	    

	}

}
