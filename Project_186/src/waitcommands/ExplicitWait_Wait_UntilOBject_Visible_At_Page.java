package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Wait_UntilOBject_Visible_At_Page {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");  //Load webpage
		driver.manage().window().maximize();    //maximize browser window
		System.out.println("browser is up and ready to use");	
		
		
		WebElement Signup_link=driver.findElement(By.linkText("Sign Up"));
		Signup_link.click();
		
		
		
		WebElement Firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		new WebDriverWait(driver, 20)
		.until(ExpectedConditions.visibilityOf(Firstname)).sendKeys("Newuser");
		
		
		By Retype_email_location=By.name("reg_email_confirmation__");
		new WebDriverWait(driver, 50)
		.until(ExpectedConditions.visibilityOfElementLocated(Retype_email_location))
		.sendKeys("Typed");
		
		
		//Wrap webdriver wait int element
		By Female_Gender_location=By.xpath("//input[@value='1']");
		WebElement Female_Radio_btn=new WebDriverWait(driver, 50)
				.until(ExpectedConditions.elementToBeClickable(Female_Gender_location));
		Female_Radio_btn.click();
		
		
	}

}
