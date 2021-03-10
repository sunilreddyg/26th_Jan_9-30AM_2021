package waitcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Wait_For_Frame {

	public static void main(String[] args) {
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();						
		driver.get("https://www.cleartrip.com/account/trips?src=manageTripsl"); 
		driver.manage().window().maximize();  	
		
		
		
		//Manage timegap until frame load webpage
		new WebDriverWait(driver, 30).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("modal_window"));
		System.out.println("Expected frame loaded at webpage");
		
		
		
		
		
		
		
		
	}

}
