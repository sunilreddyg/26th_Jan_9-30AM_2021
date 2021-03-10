package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Text_Text_Presented_At_Value {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
		
		
		WebElement Mobile_Number=driver.findElement(By.xpath("//input[@data-reactid='202']"));
		Mobile_Number.clear();
		Mobile_Number.sendKeys("9030248855");
		
		//Manage timegap until expected value presented at editbox
		By Element_location=By.xpath("//input[@data-reactid='213']");
		new WebDriverWait(driver, 50).until(ExpectedConditions.textToBePresentInElementValue(Element_location, "BSNL"));
		System.out.println("Expected input presented at editbox");
		

	}

}
