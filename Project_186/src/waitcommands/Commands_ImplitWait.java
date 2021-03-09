package waitcommands;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands_ImplitWait {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS)
		.pageLoadTimeout(50, TimeUnit.SECONDS)
		.setScriptTimeout(50, TimeUnit.SECONDS);
		
		
		
		
		driver.get("https://www.outlook.com");  //Load webpage
		driver.manage().window().maximize();    //maximize browser window
		System.out.println("browser is up and ready to use");	

	}

}
