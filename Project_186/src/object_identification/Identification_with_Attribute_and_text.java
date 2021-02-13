package object_identification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identification_with_Attribute_and_text {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@placeholder='Skills, Designations, Roles, Companies']")).sendKeys("Software testing");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='Software Testing']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='Automation Testing']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='Selenium']")).click();
		
		
		
		
		
	}

}
