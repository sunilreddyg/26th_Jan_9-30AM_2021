package ui_verificationCommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute_Example1 {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:-->  Verify Roundtrip Selection State
		 * 			Given site url is "http://spicejet.com"
		 * 			And verify default selection for oneway
		 * 			When user click on Return date\
		 * 			Then selection changes to Roundtrip radio button
		 */
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement Oneway_label=driver.findElement(By.xpath("//label[.='One Way']"));
		String Runtime_oneway_class=Oneway_label.getAttribute("class");
		System.out.println(Runtime_oneway_class);
		
		if(Runtime_oneway_class.equals("select-label"))
		{
			System.out.println("Oneway Selected as default options");
			
			WebElement Return_data=driver.findElement(By.xpath("//input[contains(@id,'date2')]"));
			Return_data.click();
			Thread.sleep(3000);
			
			WebElement Roundtrip_label=driver.findElement(By.xpath("//label[.='Round Trip']"));
			String Runtime_roundtrip_class=Roundtrip_label.getAttribute("class");
			if(Runtime_roundtrip_class.equals("select-label"))
				System.out.println("Testpass, As expected roundtrip selected");
			else
				System.out.println("Testfail,roundtrip is not selected");
			
			
		}
		else
		{
			System.out.println("Oneway is not selected as default option");
		}
		
		
		
		
		
	}

}
