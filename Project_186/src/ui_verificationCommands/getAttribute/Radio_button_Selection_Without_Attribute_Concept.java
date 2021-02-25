package ui_verificationCommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_button_Selection_Without_Attribute_Concept {

	public static void main(String[] args) throws Exception {
		/*
		 * Scenario:-->  Verify Roundtrip Selection State
		 * 			Given site url is "http://makemytrip.com"
		 * 			And verify default selection for oneway
		 * 			When user click on Return date\
		 * 			Then selection changes to Roundtrip radio button
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Get runtime attribute
		WebElement Oneway_Sbtn=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']"));
		if(Oneway_Sbtn.isSelected())
		{
			System.out.println("Oneway selected default on browser launch");
			
			WebElement ReturnDate=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']"));
			ReturnDate.click();
			Thread.sleep(3000);
			
				//Verify roundtrip is selected
				WebElement Roundtrip_Sbtn=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']"));
				if(Roundtrip_Sbtn.isSelected())
				{
					System.out.println("TestPass, As expected roundtrip selected on return date selection");
				}
				else
				{
					System.out.println("Testfail, Roundtrip is not selected on Return date selection");
				}
		}
		else
		{
			System.out.println("PreCondition failed Oneway is not selected at default");
		}
	}

}
