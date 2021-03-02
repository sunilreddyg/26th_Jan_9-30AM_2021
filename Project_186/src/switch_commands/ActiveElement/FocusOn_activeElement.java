package switch_commands.ActiveElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FocusOn_activeElement {

	public static void main(String[] args)
	{
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	    

	    driver.switchTo().activeElement().sendKeys("9030248855");
	}

}
