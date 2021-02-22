package ui_verificationCommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Page_visibleText {

	public static void main(String[] args) throws Exception {
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
		Email_textbox.sendKeys("qadarshan@gmail.com");
		Thread.sleep(4000);
		
		
		WebElement Page_location=driver.findElement(By.tagName("body"));
		//Get Visible text at webpage
		String page_visibleText=Page_location.getText();
		System.out.println(page_visibleText);
		
		
		String Exp_err_msg="That Microsoft account doesn't exist. Enter a different account or get a new one.";

		//Verify Expected text visible at webpage
		if(page_visibleText.contains(Exp_err_msg))
			System.out.println("Expected text visible at webpage");
		else
			System.out.println("Expected text not visible at webpage");

		
		
	}

}
