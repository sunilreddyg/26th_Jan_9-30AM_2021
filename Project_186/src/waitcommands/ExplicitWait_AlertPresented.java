package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWait_AlertPresented {

	public static void main(String[] args) throws Exception {
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();						
		driver.get("http://demo.automationtesting.in/Alerts.html"); 
		driver.manage().window().maximize();  						
				
				
		WebElement Alert_link=driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		//Alert_link.click();  //This Line of code prompt alert at webpage.
	
		
		//Wait until alert presented at webapge
		new WebDriverWait(driver, 30).until(ExpectedConditions.alertIsPresent()).accept();
		System.out.println("Alert presented at webpage");
		
	
		
	}

}
