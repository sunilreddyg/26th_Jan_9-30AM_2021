package capture_screen;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_Capture_With_File_Utilities {

	public static void main(String[] args) throws Exception
	{
		/*
		 * 	Note:-->To use fileutils[local folders and files] in selenium 
		 * 			3.6 above version ,below downloads required.  
		 * 
		 * URL:--> https://commons.apache.org/proper/commons-io/download_io.cgi
		 * 		   Download binrary file  --> commons-io-2.6-bin.ziphttps://mvnrepository.com/artifact/commons-io/commons-io/2.4
		 * 		   Configure jar file to java project
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://spicejet.com");
		driver.manage().window().maximize();
		
		
		//Get Default system date
		Date d=new Date();
		//Create simple date format
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MMM/EEE/dd/ -hh-mm-ss");
		//Convert date using simple date formatter
		String time=sdf.format(d);
		
		
		//Create Screen
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\"+time+"image.png"));
		
		/*
		 * 1. File utitls allow to create screen without 
		 * 				using absolute path
		 * 
		 * 2. Using timestamp we can create folder
		 * 
		 */
		
		
		/*
		 * Date formatters:-->
		 * 
		 * 		yyyy =>    year   [2021]
		 * 		  yy =>    year   [21]
		 * 		  MM =>    Month  [01-12]
		 * 		MMM  =>    Month  [Jan -Dec]
		 * 		EEE  =>    week   [sun -sat]
		 * 		  dd =>    date   [01-31]
		 * 		  hh =>    hour   [01-24]
		 * 		  mm =>    minute [01-60]
		 * 		  ss =>    Seconds[01-60]
		 * 			/=> 	create sub folder
		 */


	}

}
