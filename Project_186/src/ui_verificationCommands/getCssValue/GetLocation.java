package ui_verificationCommands.getCssValue;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement Roundtrip_Label=driver.findElement(By.xpath("//label[.='Round Trip']"));
      
		//GetLocation Return to Point class
		Point Obj_point=Roundtrip_Label.getLocation();
		
		//Using Point class get Object x and  y coordinates
		int Obj_x=Obj_point.getX();
		System.out.println("Object x Coordinates are ---> "+Obj_x);
		
		int Obj_y=Obj_point.getY();
		System.out.println("Object y coordinates are ---> "+Obj_y);
		
		
		//verify Object Visibilyt At webpage using Coordinates
		if(Obj_x > 0)
		{
			System.out.println("Object visible at webpage");
		}
		else
		{
			System.out.println("Object Not visible at webpage");
		}
		
		/*
		 * Note:--. For hidden object get location return zero coordinates
		 */
		
		
	}

}
