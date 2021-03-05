package capture_screen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLess_Screen_Capture {

	public static void main(String[] args) 
	{
		
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		options.addArguments("window-size=800,600");
		options.addArguments("disable-gpu");
		options.addArguments("screenshot");
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://facebook.com");
		System.out.println("Url entered successfull");

	}

}
