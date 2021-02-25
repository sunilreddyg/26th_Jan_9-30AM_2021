package ui_verificationCommands.getCssValue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetTagname_At_Runtime {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement Dropdown=driver.findElement(By.xpath("//select[@id='Adults']"));
		String Obj_Tagname=Dropdown.getTagName();
		if(Obj_Tagname.equals("select"))
		{
			new Select(Dropdown).selectByVisibleText("5");
		}
		else
			System.out.println("Dropdown is not a select type");
		

		
		

	}

}
