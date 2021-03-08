package chrome_options;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Window_Set_Size {

	public static void main(String[] args) 
	{
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("window-size=1920,1080");
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://facebook.com");
		driver.manage().window().setSize(new Dimension(600, 200));
		System.out.println("Site is up and ready to use..");
		
		
		

	}

}
