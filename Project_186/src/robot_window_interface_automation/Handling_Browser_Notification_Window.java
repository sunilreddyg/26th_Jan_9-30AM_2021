package robot_window_interface_automation;

import java.awt.Robot;
import java.awt.event.InputEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Browser_Notification_Window {

	public static void main(String[] args) throws Exception
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");		
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		

		//Create object for robot
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		//Move mouse cursor to location
		robot.mouseMove(309, 162);
		//Press mouse left click
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		
		robot.mouseMove(715, 498);
		//Press mouse left click
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		
		robot.mouseWheel(300);    //Scroll downpage browser window
		
		
		robot.mouseWheel(-100);    //Scroll up browser window
		/*
		 * Download Cursor position tool
		 * 		http://www.softoware.org/apps/download-cursor-position-for-windows.html
		 */
				

	}

}
