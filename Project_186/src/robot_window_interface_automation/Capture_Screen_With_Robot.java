package robot_window_interface_automation;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Screen_With_Robot {

	public static void main(String[] args) throws Exception {
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");		
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Get Default Sceen dimension
		Dimension Screen_Dimension=Toolkit.getDefaultToolkit().getScreenSize();
		//Creating object for class
		Robot obj=new Robot();
		//Create screen and convert into buffered image
		BufferedImage Final_Screen=obj.createScreenCapture(new Rectangle(Screen_Dimension));
		//Dump Screen into local system
		ImageIO.write(Final_Screen, "PNG", new File("C:\\Users\\Administrator\\Desktop\\sceens\\image.png"));
		
		
		/*
		 * Disadvantage:-->
		 * 			What it can see it captures
		 * Advantages:-->
		 * 		Capture screen when alert presetned, Where as
		 * 			selenium webdriver fail to capture.
		 */
		
		

	}

}
