package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Wait_For_Attribute {

	public static void main(String[] args) {
		

		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();					
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize(); 
		
		
		WebElement Roundtrip_label=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
		new WebDriverWait(driver, 50).until(ExpectedConditions.attributeToBe(Roundtrip_label, "class","selected"));
		System.out.println("timeout released roundtrip is selected");
	}

}
