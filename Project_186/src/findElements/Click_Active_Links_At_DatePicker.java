package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Active_Links_At_DatePicker {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		WebElement DatePicker=driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]"));
		DatePicker.click();
		Thread.sleep(2000);
		
		WebElement Next_button=driver.findElement(By.xpath("//a[@title='Next']"));
		String Runtime_Class=Next_button.getAttribute("class");
		boolean flag=Runtime_Class.contains("disabled");
		
		while(flag==false)
		{
			Next_button=driver.findElement(By.xpath("//a[@title='Next']"));
			Runtime_Class=Next_button.getAttribute("class");
			flag=Runtime_Class.contains("disabled");
			
		
			WebElement Active_month=driver.findElement(By.cssSelector(".ui-datepicker-calendar"));
			List<WebElement> All_Dates=Active_month.findElements(By.tagName("a"));
		
			//Iterate for number of links
			for (int i = 0; i < All_Dates.size(); i++) 
			{
				All_Dates.get(i).click();
				Thread.sleep(500);
				
				DatePicker.click();
				Thread.sleep(500);
				
				//Restore all references to avoid stale element reference exception
				Active_month=driver.findElement(By.cssSelector(".ui-datepicker-calendar"));
				All_Dates=Active_month.findElements(By.tagName("a"));
			}
			
			
			Next_button=driver.findElement(By.xpath("//a[@title='Next']"));
			Runtime_Class=Next_button.getAttribute("class");
			flag=Runtime_Class.contains("disabled");
			
			Next_button.click();
			Thread.sleep(2000);
				
			
		}


	}

}
