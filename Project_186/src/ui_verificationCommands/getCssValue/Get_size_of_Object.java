package ui_verificationCommands.getCssValue;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_size_of_Object {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement From_Editbox=driver.findElement(By.xpath("//input[@name='ctl00_mainContent_ddl_originStation1_CTXT']"));
		//Get Object Height and width at runtime
		Dimension Obj_dimension=From_Editbox.getSize();
		int Obj_height=Obj_dimension.getHeight();
		int Obj_Width=Obj_dimension.getWidth();
		System.out.println("Object Height is --> "+Obj_height);
		System.out.println("Object width  is  --->"+Obj_Width);
		
		
		//Verify Object visibility using height and width
		if(Obj_height > 0)
			System.out.println("Object visible at webpage");
		else
			System.out.println("Object hiddent at webpage");
		
		

		

	}

}
