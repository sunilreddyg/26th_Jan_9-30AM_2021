package findElements.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_inside_WetableCell_Using_referral_text {

	public static void main(String[] args) {
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
			
			//Get Text of each row
			String RowText=DynamicRow.getText();
			
			//Decision to verify Expected Record available
			if(RowText.contains("St Bk of India"))
			{
				System.out.println("bank available at row ---> "+i);
				//Find List of cells available at row
				List<WebElement> cells=DynamicRow.findElements(By.tagName("td"));
				
				//Target Company name
				WebElement Cname_cell=cells.get(0);
				Cname_cell.findElement(By.tagName("a")).click();
				break; //Stop Iteration 
				
			}
			
		}
		

	}

}
