package capture_screen;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Screen_When_AlertPresented {

	public static void main(String[] args) throws Exception 
	{
		
		
		
		
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    Alert_prompt_link.click();
	    Thread.sleep(3000);
	    
		
	    DateFormat df=new SimpleDateFormat("yyyyMMdd hh mm ss a");
	   
		
		//Get Default Sceen dimension
		Dimension Screen_Dimension=Toolkit.getDefaultToolkit().getScreenSize();
		//Creating object for class
		Robot obj=new Robot();
		//Create screen and convert into buffered image
		BufferedImage Final_Screen=obj.createScreenCapture(new Rectangle(Screen_Dimension));
		 Calendar now = Calendar.getInstance();
		 System.out.println(now.getTime());
		//Dump Screen into local system
		ImageIO.write(Final_Screen, "PNG", new File("C:\\Users\\Administrator\\Desktop\\sceens\\"+df.format(now.getTime())+"image.png"));
		
		
		
		

	}

}
