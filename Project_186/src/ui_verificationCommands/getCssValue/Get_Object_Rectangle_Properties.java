package ui_verificationCommands.getCssValue;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Object_Rectangle_Properties {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement From_Editbox=driver.findElement(By.xpath("//input[@name='ctl00_mainContent_ddl_originStation1_CTXT']"));
		
		//Get Posint and Dimensions
		Point Obj_Point=From_Editbox.getRect().getPoint();
		System.out.println("Object coordinates are ---> "+Obj_Point);
		
		
	}

}
