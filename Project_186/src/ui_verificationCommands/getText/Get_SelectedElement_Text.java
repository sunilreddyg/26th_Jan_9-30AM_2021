package ui_verificationCommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_SelectedElement_Text {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Scenario:
		 * 		Given site url is "http://outlook.com"
		 * 		When user click on SignIn button
		 * 		And Enter Invalid Email entry with wrong domain
		 * 		And click Next button to validate email
		 * 		Then Error message displayed "That Microsoft account doesn’t exist. Enter a different account or get a new one."
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.com");
		driver.manage().window().maximize();
		
		
		WebElement Signin_nav_link=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		Signin_nav_link.click();
		
		WebElement Email_textbox=driver.findElement(By.xpath("//input[@id='i0116']"));
		Email_textbox.sendKeys("qadarshan@gmail.com"+Keys.ENTER);
		Thread.sleep(4000);
		
		
		WebElement Error_location=driver.findElement(By.xpath("//div[@id='usernameError']"));
		//Get Visible InnerText at location
		String Act_err_msg=Error_location.getText();
		System.out.println(Act_err_msg);
		
		
		String Exp_err_msg="That Microsoft account doesn't exist. Enter a different account or get a new one.";

		//Verify Text visibility at webapge [get text return empty when text not visible at webpage]
		if(!Act_err_msg.isEmpty())
		{
			System.out.println("error text visible at webpage");
				
				//Verify Text Comparision
				if(Act_err_msg.equals(Exp_err_msg))
					System.out.println("testpass, As expected Error message displayed at webpage");
				else
					System.out.println("testfail, Expected error message not displayed at webpage");
		}
		else
		{
			System.out.println("Error text not visible at webpage");
		}
		
		
		
		
	}

}
