package switch_commands.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Alert_Presented_With_Try_Catch {

	public static void main(String[] args) throws Exception 
	{
	
		/*
		 * How to handle survival popus?
		 * 		Step1:--> verify alert presented at webpage
		 * 		Step2:--> Write alert hadling under Condition
		 * 
		 * 		These popups optionally presetned at webpage, Handle
		 * 		alerts only when it was presented and skip actions
		 * 		when it is not presented..
		 */
		
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    Alert_prompt_link.click();
	    Thread.sleep(3000);
	    
	    
	    try {
	    	
	        //Switching to alert and wrapped alert into Interface class
		    Alert alert=driver.switchTo().alert();
		    
		    //Get Text on alert
		    String alert_msg=alert.getText();
		    System.out.println(alert_msg);
		    
		    //We can use accept /dismiss to close alert window
		    alert.accept();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	    System.out.println("Run Continued");
		

	}

}
