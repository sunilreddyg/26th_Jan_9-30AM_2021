package chrome_options;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Adding_Plugins_To_Automation_Browser {

	public static void main(String[] args) 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		options.addExtensions(new File("C:\\Users\\Administrator\\Downloads\\mooikfkahbdckldjjndioackbalphokd-3.17.0-Crx4Chrome.com.crx"));
		options.addExtensions(new File("C:\\Users\\Administrator\\Downloads\\mgjhkhhbkkldiihlajcnlfchfcmhipmn-1.0.0-Crx4Chrome.com.crx"));
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://facebook.com");
		System.out.println("Site is up and ready to use..");

	}

}
