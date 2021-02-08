package selenium.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Seleting_MoreThan_One_Option {

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
		
		//Verify Dropdown multiple selection type.
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdown multiple selection state is ---> "+flag);
		
		//Decision statement to continue on multiple selection
		if(flag==true)        //if condition only accept boolean values
		{
			System.out.println("yes, dropdown is multiple selection type");
			Select State_Dropdown=new Select(driver.findElement(By.id("customState")));
			State_Dropdown.deselectAll();      //Deselet only work on multiple selection type
			State_Dropdown.selectByIndex(3);
			State_Dropdown.selectByIndex(6);
			
		}
		else
		{
			System.out.println("No, dropdown is not a multiple selection type");
		}
		
		
		/*
		 * Note:-->
		 * 		For selecton of single option sleection and multiple option selection
		 * 		we follow same command. 
		 * 			
		 * 			For Single Option to Select:-->
		 * 				new Select(WebElement).SelectByIndex(2);
		 * 
		 * 			For Multiple Option to Select:-->  [Just repeat selection twice]
		 * 				new Select(WebElement).SelectByIndex(1);
		 * 				new Select(WebElement).SelectByIndex(2);
		 */
		
		
		
		
		
	}

}
