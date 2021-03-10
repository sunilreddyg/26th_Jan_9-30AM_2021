package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Element_PresentedAt_Source {

	public static void main(String[] args) throws Exception 
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://www.cleartrip.com");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		Thread.sleep(5000);
		
		
		WebElement From_City=driver.findElement(By.xpath("//input[@id='FromTag']"));
		From_City.clear();
		From_City.sendKeys("HYD");
		By HYD_City=By.xpath("//a[contains(.,'Hyderabad, IN - Rajiv Gandhi International (HYD)')]");
		
		//Wait until HYD city Object Load at Document Object Model [It work same as implicit wait]
		new WebDriverWait(driver,100).until
		(ExpectedConditions.presenceOfElementLocated(HYD_City)).click();
		
		
		WebElement To_city=driver.findElement(By.xpath("//input[contains(@name,'destination')]"));
		To_city.clear();
		To_city.sendKeys("DEL");
		By DEL_city=By.xpath("//a[contains(.,'New Delhi, IN - Indira Gandhi Airport (DEL)')]");
		new WebDriverWait(driver, 50).until
		(ExpectedConditions.visibilityOfElementLocated(DEL_city)).click();
		
		
		
		

	}

}
