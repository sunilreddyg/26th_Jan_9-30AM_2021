package findElements.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Next_Page_Records {

	public static void main(String[] args) 
	{
	
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.icicidirect.com/equity/index/overview");
		driver.manage().window().maximize();
		
		WebElement Next_button=driver.findElement(By.id("tblIdxMoment_next"));
		
		boolean flag=false;
		do {
			
			//Target Table Location at webpage
			WebElement Table=driver.findElement(By.xpath("//table[@id='tblIdxMoment']/tbody"));
			//Get all Rows inside table
			List<WebElement> rows=Table.findElements(By.tagName("tr"));
			System.out.println(rows.size());
			//Iterate for number or rows
			for (int i = 0; i < rows.size(); i++) 
			{
				//Each Dynamic row
				String ShareName=rows.get(i).findElements(By.tagName("td")).get(0).getText();
				System.out.println(ShareName);
			}
		
			
		

			//Get Runtime attribute value
			Next_button=driver.findElement(By.id("tblIdxMoment_next"));
			String Next_btn_runtime_class=Next_button.getAttribute("class");
			flag=Next_btn_runtime_class.contains("disabled");
			
			if(flag==false)
			{
				Next_button.click();
				System.out.println("Next button clicked");
			}
			
		} while (flag==false);   //When Next button get disable it stop iteration

		
		

	}

}
