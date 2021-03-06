package findElements.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class In_WebTable_Read_All_DynamicRows_Data {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.icicidirect.com/equity/sector-overview");
		driver.manage().window().maximize();
		
		
		//Identifying table
		WebElement Table=driver.findElement(By.xpath("//table[@id='tbl_sector0']/tbody"));
		//Get number of rows availabel at table
		List<WebElement> rows=Table.findElements(By.tagName("tr"));
		System.out.println("Number of rows available ---> "+rows.size());
		
		//Iterate for number of rows
		for (int i = 0; i < rows.size(); i++) 
		{
			//Target Each Row with help of index number
			WebElement DynamicRow=rows.get(i);
			
			//Find List of cells available at row
			List<WebElement> cells=DynamicRow.findElements(By.tagName("td"));
			
			//Target Each cell using index number
			String Cname=cells.get(0).getText();
			String Mcap=cells.get(1).getText();
			String Ltp=cells.get(2).getText();
			
			System.out.println(Cname+"\t"+Mcap+"\t"+Ltp);
			

		}
		
		
	}

}
