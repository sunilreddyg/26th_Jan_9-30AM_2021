package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_Links {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement Footer_Area=driver.findElement(By.cssSelector(".inline.clearFix"));
		List<WebElement> Footer_Links=Footer_Area.findElements(By.tagName("a"));
		
		//Iterate for number of links
		for (int i = 0; i < Footer_Links.size(); i++) 
		{
			//Get Each link from footerlink using index number
			WebElement Eachlink=Footer_Links.get(i);
			String LinkName=Eachlink.getText();
			String LinkHref=Eachlink.getAttribute("href");
			//System.out.println(LinkName+"\t"+LinkHref);
			
			Eachlink.click();
			Thread.sleep(2000);
			System.out.println(LinkName+"\t"+driver.getTitle());
			
			driver.navigate().back();
			Thread.sleep(3000);
			
			//Restore all page referrences to avoid staleElement Reference exception
			Footer_Area=driver.findElement(By.cssSelector(".inline.clearFix"));
			Footer_Links=Footer_Area.findElements(By.tagName("a"));
		}
		
		
		
		
	}

}
