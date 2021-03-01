package switch_commands.Frames;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchTo_Different_Frame {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://epass.apcfss.in/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    
	    //Switch to frame using frameid
	    driver.switchTo().frame("menuFrame");
	    
	    //Click Feestructure link under menu frame
	    WebElement Fee_structure=driver.findElement(By.xpath("//a[@href='FeestructureReport.do']"));
	    Fee_structure.click();
	    Thread.sleep(4000);
	    
	    //Get Control back to Mainapge
	    driver.switchTo().defaultContent();
	    //Switch to frame using FrameID
	    driver.switchTo().frame("bodyFrame");
	    
	    WebElement University=driver.findElement(By.xpath("//select[@id='univ']"));
	    new Select(University).selectByVisibleText("ANDHRA UNIVERSITY");
	    System.out.println(new Select(University).getFirstSelectedOption().getText());
	    Thread.sleep(5000);
	    
	    WebElement CourseId=driver.findElement(By.xpath("//select[@id='coursesId']"));
	    new Select(CourseId).selectByVisibleText("INTER (CEC)");
	    Thread.sleep(3000);
	    
	    WebElement Course_year=driver.findElement(By.xpath("//select[@id='courseYearId']"));
	    new Select(Course_year).selectByIndex(1);
	    
	    WebElement Aca_year=driver.findElement(By.xpath("//select[@name='ac_year']"));
	    new Select(Aca_year).selectByIndex(2);
	    
	    WebElement Submit_btn=driver.findElement(By.xpath("//input[@name='submit']"));
	    Submit_btn.click();
	    Thread.sleep(5000);
	    
	    try {
			WebElement Result_location=driver.findElement(By.xpath("//font[contains(.,'No Details Found')]"));
			System.out.println(Result_location.getText());
			
		} catch (NoSuchElementException e) {
			System.out.println("Element not found at source");
		}

	}

}
