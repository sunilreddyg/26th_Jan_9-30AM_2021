package capture_screen;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreen_With_TimeStamp {

	public static void main(String[] args) throws Exception {
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");		
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		
		
		//Get Default system time
		Date d=new Date();
		//Create simple date format
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy_MMM_DD_hh-mm-ss");
		//Convert Default date using simple date format
		String time=sdf.format(d);
		
		//Takescreen and convert into output file
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.createDir(new File("D:\\MyprojectA\\Screens"));
		FileHandler.copy(src, new File("D:\\MyprojectA\\Screens\\image"+time+".png"));
		System.out.println("Folder and file created");
				
		
		
		
		

	}

}
