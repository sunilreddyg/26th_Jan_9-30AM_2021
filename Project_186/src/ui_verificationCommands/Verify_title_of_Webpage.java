package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_title_of_Webpage {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver page=new ChromeDriver();
		page.get("https://selenium.dev");
		page.manage().window().maximize();

		
		String page_title=page.getTitle();
		System.out.println("Current page title is ---> "+page_title);
		
		String Exp_title="SeleniumHQ Browser Automation";
		
		//Verify page title matches with Expected title
		boolean flag=page_title.equals(Exp_title);
		System.out.println("Title verified status is --> "+flag);
		
		//Decision to Continue on title verified
		if(flag==true)
		{
			WebElement Download_link=page.findElement(By.xpath("//div[@class='download-button webdriver']"));
			Download_link.click();
			
			//Nested Condition to Continue Script on title verified
			if(page.getTitle().equals("Downloads"))
				System.out.println("Downloads page title verifed");
			else
				System.out.println("Downloads page title not verified");
		}
		else
		{
			System.out.println("Test suspended homepage title not verified");
		}
		
		
		
		
		
		
	}

}
