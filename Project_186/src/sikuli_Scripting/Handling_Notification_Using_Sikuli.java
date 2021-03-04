package sikuli_Scripting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;

public class Handling_Notification_Using_Sikuli {

	public static void main(String[] args) throws Exception {

		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");		
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		String image_location="D:\\new sikuli\\images\\";
		Screen screen=new Screen();
		screen.click(image_location+"Allow.png");
		

	}

}
