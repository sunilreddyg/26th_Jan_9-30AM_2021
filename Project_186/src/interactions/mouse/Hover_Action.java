package interactions.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover_Action {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.naukri.com");
	    driver.manage().window().maximize();
	    
		
	 
	    //Create object for action class and perform hover action on selected location
	    WebElement Jobs_MainMenu=driver.findElement(By.xpath("//div[@class='mTxt'][contains(.,'Jobs')]"));
	    new Actions(driver).moveToElement(Jobs_MainMenu).perform();
	    Thread.sleep(3000);
	    
	    //Perform click action using mouse interactions command
	    WebElement Register_SubMenu_From_Jobs=driver.findElement(By.xpath("//a[@data-ga-track='Main Navigation Jobs|Register Now']"));
	    new Actions(driver).click(Register_SubMenu_From_Jobs).perform();
	    
	    

	}

}
