package selenium.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselecting_Option_From_Multiple_Selection 
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
	/*	((JavascriptExecutor)driver).executeScript
		("document.getElementById('customState').setAttribute('multiple','multiple')");
		Thread.sleep(4000);
		
		*/
		//Get dropdown selection type
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdown Multiple Selection state is --> "+flag);
		
		
		Select State_Dropdown=new Select(driver.findElement(By.id("customState")));
		State_Dropdown.deselectAll();     //All deselect commands only works on multiple selection dropdown
		State_Dropdown.selectByIndex(3);
		State_Dropdown.selectByIndex(6);
		
		int Scount=State_Dropdown.getAllSelectedOptions().size();
		System.out.println("Numeber of option selected--> "+Scount);
		
		State_Dropdown.deselectByIndex(3);
		
		int Dcount=State_Dropdown.getAllSelectedOptions().size();
		System.out.println("Number of options selected ---> "+Dcount);
		
		if(Dcount==1)
		{
			System.out.println("Testpass, Dropdown allowed user to deselect option");
		}
		else
		{
			System.out.println("Testfail, Dropdown is not allowed user to deselect option");
		}
		
		System.out.println(State_Dropdown.getFirstSelectedOption().getText());
		
		
	}

}
