package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_urlof_Webpage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver page=new ChromeDriver();
		page.get("https://selenium.dev");
		page.manage().window().maximize();
		
		
		String Runtime_url=page.getCurrentUrl();
		System.out.println(Runtime_url);
		
		String Exp_url="https://www.selenium.dev/";

		//Decision to validate browser protocal
		if(Runtime_url.contains("https://"))
		{
			System.out.println("Secured page");
			
			//Decision to validate Url of Homepage
			if(Runtime_url.equals(Exp_url))
			{
				System.out.println("Verified url of webpage");
				WebElement Download_link=page.findElement(By.xpath("//div[@class='download-button webdriver']"));
				Download_link.click();
				
				//Verify Downloda page url
				if(page.getCurrentUrl().contains("downloads/"))
					System.out.println("Downloads url verified");
				else
					System.out.println("Download page url not verified");
			}
			else
				System.out.println("url mismatch for homepage");
		}
		else
		{
			System.out.println("unsecure page");
		}
	}

}
