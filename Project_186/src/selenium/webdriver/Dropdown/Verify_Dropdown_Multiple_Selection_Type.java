package selenium.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Multiple_Selection_Type {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Is dropdown is multiple type ? ---> "+flag);
		
		

	}

}
