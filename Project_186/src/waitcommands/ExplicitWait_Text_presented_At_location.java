package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Text_presented_At_location {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();
		
		
		WebElement Signin_btn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		Signin_btn.click();
		
		
		
		WebElement Email=driver.findElement(By.xpath("//input[@id='i0116']"));
		Email.clear();
		Email.sendKeys("sunilreddy@outlook.com"+Keys.ENTER);

		
		//Manage timegap until expected text visible at location..
		By Text_location=By.id("displayName");
		new WebDriverWait(driver, 100).until(ExpectedConditions.textToBePresentInElementLocated(Text_location, "sunilreddy@outlook.com"));
		System.out.println("text presented at Element location");
		
		
	}

}
