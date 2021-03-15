package mq.java.core.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class While_Example 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		//Print Numbers 1 to 10
		int i=1;
		while(i <= 10)
		{
			System.out.println(i);
			i=i+1;
		}
		
		
		//While with False Condition
		int j=10;
		while(j < 1)
		{
			System.out.println("This statement doesn't run");
		}
		
		
		
	    /*	
		//Infinity loop
		boolean flag=true;
		while(flag==true)
		{
			System.out.println("I am infinite");
		}
		*/
		
		/*
		 * FAQ:--> manage Explicit wait using while loop
		 * 
		 */
	
		//Set Runtime environment variable for chrome driver
		String chrome_path="Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
						
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		Thread.sleep(10000);	
		
		
		//It is a Hidden Element
		WebElement Retype_Passwrod=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		
		int count=1;
		while(!Retype_Passwrod.isDisplayed())
		{
			System.out.println("Element not displayed");
			Thread.sleep(1000);
			if(count==30)
			{
				throw new ElementNotVisibleException("Element Not visibel waited for 30 Seconds");
			}
			count=count+1;
		}
		
		System.out.println("Element is Displayed");
		
		
		

	}

}
