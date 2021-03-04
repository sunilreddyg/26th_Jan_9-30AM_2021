package robot_window_interface_automation;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Upload_file_to_Webpage_From_local_System {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");    
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://naukri.com");
		driver.manage().window().maximize();
		
		//Click Upload button
		WebElement File_upload_btn=driver.findElement(By.xpath("//label[@id='wdgt-file-upload']"));
		File_upload_btn.click();
		Thread.sleep(4000);
		
		
		
		//Copy text into clipboard
		String path="C:\\Users\\Administrator\\Desktop\\My_resume";
		StringSelection Spath=new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Spath, Spath);
	
		//Create object for class
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		//Press cntrl+V to paste Selected String
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		//Release cntrl key
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}

}
