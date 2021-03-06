package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_user_Actions {

	public static void main(String[] args) throws Exception
	{

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		System.out.println("Url entered successfull");
		
		//Enable javascript on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		js.executeScript("document.getElementById('email').value='9030248855'");
		js.executeScript("document.getElementById('pass').value='Hello1234567'");
		
		WebElement Signin_btn=driver.findElement(By.xpath("//button[contains(@name,'login')]"));
		js.executeScript("arguments[0].click();", Signin_btn);
		Thread.sleep(5000);

		
		
		
		
		
	}

}
