package ui_verificationCommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Option_Available_At_dropdown {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		WebElement Month_Dropdown=driver.findElement(By.id("month"));
		//Get All option text under month dropdown
		String All_months=Month_Dropdown.getText();
		System.out.println(All_months);
		
		if(All_months.contains("Feb"))
			System.out.println("Expected option visible at dropdown");
		else
			System.out.println("Expected option not visible at dropdown");
		
		
		
		

	}

}
