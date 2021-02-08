package selenium.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Required_Option_Selected_At_dropdown {

	public static void main(String[] args) throws Exception 
	{
	
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		//Click Link Moreoptions
		driver.findElement(By.id("MoreOptionsLink")).click();
		Thread.sleep(3000);
		
		//IDentify dropdown with selec class
		Select Travel_Class=new Select(driver.findElement(By.id("Class")));
		Travel_Class.selectByIndex(2);
		
		//Verify Premium Economy option selected dropdown
		String OptioName=Travel_Class.getFirstSelectedOption().getText();
		
		//This condition verify required option available at dropdown
		if(OptioName.equals("Premium Economy"))
		{
			System.out.println("Testpass, Required option is selected");
		}
		else
		{
			System.out.println("Testfail, Wrong option selected--->"+
						Travel_Class.getFirstSelectedOption().getText());
		}

	}

}
