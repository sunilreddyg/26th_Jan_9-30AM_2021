package pagefactory.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Run_SearchTrains {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		

		//Create object for class
		Search_Trains obj=new Search_Trains(driver);
		obj.Verify_Cleartrip_Trains_page_title();
		obj.From_AEB.clear();
		new Actions(driver).sendKeys(obj.From_AEB, "Sec")
		.pause(2000).sendKeys(Keys.TAB).perform();
		Thread.sleep(4000);
		
		obj.To_AEB.clear();
		new Actions(driver).sendKeys(obj.To_AEB, "ATP")
		.pause(2000).sendKeys(Keys.TAB).perform();
		
		new Select(obj.Select_Train_classType)
		.selectByIndex(3);
		
		

	}

}
