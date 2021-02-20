package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_Presented_At_source 
{

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver page=new ChromeDriver();
		page.get("https://facebook.com");
		page.manage().window().maximize();
		
		
		String ElementId="email";
		
		//Get Runtime page source
		String Page_source=page.getPageSource();
		
		//Decision to verify Element presented at source
		//This Condition only allow action object when elementid presented at source
		if(Page_source.contains(ElementId))
		{
			page.findElement(By.id("email")).clear();
			page.findElement(By.id("email")).sendKeys("sunil@gmail.com");
		}
		else
			System.out.println("element not presented at source");
		
		
		/*
		 * Dynamic Objects Handling using try catch block..
		 */
		
	
		try {
			
			page.findElement(By.id("email")).clear();
			page.findElement(By.id("email")).sendKeys("sunil@gmail.com");
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Run Continued");

	}

}
