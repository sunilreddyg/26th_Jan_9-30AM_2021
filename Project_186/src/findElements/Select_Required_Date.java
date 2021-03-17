package findElements;

import java.time.chrono.ThaiBuddhistEra;

import javax.print.attribute.standard.DateTimeAtProcessing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_Required_Date {

	public static void main(String[] args) throws InterruptedException 
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
			
			//Target Header
			WebElement Month_Header=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
			//Get Text of header
			String Runtime_Month_Name=Month_Header.getText();
			System.out.println(Runtime_Month_Name);
			if(Runtime_Month_Name.equals("August"))
			{
				driver.findElement(By.linkText("24")).click();
				break;
			}
			
			
			
			
			Next_button.click();
			Thread.sleep(2000);
			
			
			
		}

	}

}
