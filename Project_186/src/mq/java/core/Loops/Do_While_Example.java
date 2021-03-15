package mq.java.core.Loops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Do_While_Example {

	public static void main(String[] args) throws Exception 
	{
		
		
		//Do while with false condition
		int i=10;
		do {
			System.out.println(i);  //It Execute once even Condition return false
		} while (i >100);
		
		
		//While with False Condition
		int j=10;
		while(j < 1)
		{
			System.out.println("This statement doesn't run");
		}
		
		
		//Do while with true Condition
		int k=1;
		do {
			System.out.println(k);
			k=k+1;
		} while (k <=10);
		
		
		/*
		 * FAQ:--> Repeat program execution when Condition  Return False.
		 */
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
						
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		
		boolean flag=false;
		int count=1;
		do {
			driver.get("https://www.facebook.com/");
			
			try {
				String Exp_title="Sign up for Facebook | Facebook";
				flag=new WebDriverWait(driver, 20).until(ExpectedConditions.titleIs(Exp_title));
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			count=count+1;
			if(count==4)
			{
				throw new Exception("Application Failed to Load Tried 10 attemps");
			}
			
		} while (flag==false);
		
		System.out.println("page loaded successfully");
		
		
		

	}

}
