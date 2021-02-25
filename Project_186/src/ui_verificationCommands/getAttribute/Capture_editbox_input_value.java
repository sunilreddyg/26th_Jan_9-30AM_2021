package ui_verificationCommands.getAttribute;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_editbox_input_value {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Scenario:--> Verify departure date showind 	
		 * 				default date as current system date.
		 */
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement Deapartue_Date=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']"));
		//Get Input From editbox
		String Ddate=Deapartue_Date.getAttribute("value");
		System.out.println(Ddate);
		
		
		//Get system Default date
		Date d=new Date();
		System.out.println(d.toString());
		//create simple date format
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM");
		//Convert system date using simple date formatter
		String Sdate=sdf.format(d);
		
		if(Sdate.equals(Ddate))
			System.out.println("Testpass As expected departure date matching with current date");
		else
			System.out.println("Testfail deparetue date mismatch with current date");

		
		
		/*
		 * Date formatters:-->
		 * 
		 * 		yyyy =>    year   [2019]
		 * 		  yy =>    year   [19]
		 * 		  MM =>    Month  [01-12]
		 * 		MMM  =>    Month  [Jan -Dec]
		 * 		EEE  =>    week   [sun -sat]
		 * 		  dd =>    date   [01-31]
		 * 		  hh =>    hour   [01-24]
		 * 		  mm =>    minute [01-60]
		 * 		  ss =>    Seconds[01-60]
		 * 		
		 */

	}

}
