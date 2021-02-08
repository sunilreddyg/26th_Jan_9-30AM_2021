package selenium.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Creating_Multiple_Selection_Dropdown 
{

	public static void main(String[] args) throws Exception 
	{
	
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		/*
		 * Converting Single Selection dropdown into Multiple Selecton dropdown
		 * using Javascript Executor...
		 * 
		 * 			Note:-->
		 * 					Changes effect temporary
		 * 					This is not a tester job.
		 */
		((JavascriptExecutor)driver).executeScript
		("document.getElementById('customState').setAttribute('multiple','multiple')");
		Thread.sleep(4000);
		
		
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdown multiple selection state is ---> "+flag);
		
		
		

	}

}
