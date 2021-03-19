package findElements.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Click_Inside_WebTable {

	public static void main(String[] args) throws Exception {
	
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.icicidirect.com/equity/index/overview");
		driver.manage().window().maximize();
		
		
		
		WebElement Next_button=driver.findElement(By.id("tblIdxMoment_next"));
		
		boolean flag=false;
		boolean RecordStatus=false;
		do {
			
			//Target Table Location at webpage
			WebElement Table=driver.findElement(By.xpath("//table[@id='tblIdxMoment']/tbody"));
			//Get all Rows inside table
			List<WebElement> rows=Table.findElements(By.tagName("tr"));
			//System.out.println(rows.size());
			
			
			//Iterate for number or rows
			for (int i = 0; i < rows.size(); i++) 
			{
				//Target Eachrow
				String RowText=rows.get(i).getText();
				//Verify Expected Record available 
				if(RowText.contains("Nifty 200"))
				{
					System.out.println("Record found at table");
					List<WebElement> cells=rows.get(i).findElements(By.tagName("td"));
					WebElement IndexCell=cells.get(0);
					IndexCell.findElement(By.tagName("a")).click();
					RecordStatus=true;   //Assign status is true
					break; //Break iteration of for loop
				}
			}//for
		
			
			if(RecordStatus==true)
			{
				break;  //Break Outter condition on record Found
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

		System.out.println("Record found status --> "+RecordStatus);
		
		
		if(RecordStatus==true)
		{
			//Target Index Table
			Thread.sleep(5000);
			WebElement Index_Table=driver.findElement(By.xpath("//table[@id='tblIndexConst']/tbody"));
			System.out.println(Index_Table.getText());
		}
		
		
		
		
		
		

	}

}
