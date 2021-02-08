package selenium.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_OptonsCount_At_Dropdown 
{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		//Selecting no of adults 
		new Select(driver.findElement(By.id("Adults"))).selectByVisibleText("9");
		
		Select Childrens_Dropdown=new Select(driver.findElement(By.id("Childrens")));
		int Option_count=Childrens_Dropdown.getOptions().size();
		
		//Decison to verify Option count
		if(Option_count > 1)
		{
			System.out.println("Testfail, Childrens Doesn't any option after maximum selection");
		}
		else
		{
			System.out.println("Testpass, Childrens dropdown not showing any options");
		}
		
		
		//Verify infants dropdown displayed number of options according adults selection..
		
		
		
	}

}
