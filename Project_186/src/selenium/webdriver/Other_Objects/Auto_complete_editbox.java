package selenium.webdriver.Other_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Auto_complete_editbox 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Seleting radio button
		driver.findElement(By.id("RoundTrip")).click();
		
		//Select list of items under autocomplete editbox
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("HYD");
		Thread.sleep(5000);  //Static timeout to load sugesstions
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		//Select list of items under autocomplete editbox
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("DEL");
		Thread.sleep(5000);  //static  timeout to load sugesstions
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
		
		//Seleting Date from datepicker
		driver.findElement(By.linkText("25")).click();
		Thread.sleep(4000);
		
		//Seleting Date from datepicker
		driver.findElement(By.xpath("(//a[contains(.,'26')])[2]")).click();
		Thread.sleep(4000);
		
		//Type Text into Departure editbox [Only try when editbox is in writable mode]
		driver.findElement(By.id("ReturnDate")).clear();
		driver.findElement(By.id("ReturnDate")).sendKeys("Thu, 15 Jul, 2021");

		//Select dropdown
		new Select(driver.findElement(By.id("Adults"))).selectByIndex(4);
		
		//Click Button
		driver.findElement(By.id("SearchBtn")).click();
		
	}

}
