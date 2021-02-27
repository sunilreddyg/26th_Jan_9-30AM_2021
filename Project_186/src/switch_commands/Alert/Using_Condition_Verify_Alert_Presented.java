package switch_commands.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Using_Condition_Verify_Alert_Presented {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stu	//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    Alert_prompt_link.click();
	    Thread.sleep(3000);
	    
	    
	    //Verify alert presented at webpage using Conditional statement
	    if(ExpectedConditions.alertIsPresent().apply(driver)!=null)
	    {
	    	System.out.println("Alert presented at webpage");
	    	driver.switchTo().alert().accept();
	    }
	    else
	    {
	    	System.out.println("Alert not presented at webpage");
	    }
	    
	    

	}

}
