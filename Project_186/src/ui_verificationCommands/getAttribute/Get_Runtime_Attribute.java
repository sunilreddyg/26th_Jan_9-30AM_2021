package ui_verificationCommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Runtime_Attribute 
{

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
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Get runtime attribute
		WebElement Oneway_Sbtn=driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']"));
		String Oneway_Runtime_Value=Oneway_Sbtn.getAttribute("class");
		
		//Decisiont to verify Oneway radio button selected with runtime property
		if(Oneway_Runtime_Value.equals("selected"))
		{
			System.out.println("As Expected Oneway Selected Default on browser launch");
			
			//Select return  date
			WebElement Return_date=driver.findElement(By.xpath("//span[contains(.,'RETURN')]"));
			Return_date.click();
			Thread.sleep(3000);
			
			//Verifying roundtirp radio button selection
			WebElement Roundtrip_Sbtn=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
			String Roundtrip_Runtime_value=Roundtrip_Sbtn.getAttribute("class");
			if(Roundtrip_Runtime_value.equals("selected"))
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
			System.out.println("PreCondition failed Oneway is not Selected Default");
		}
		
	}

}
