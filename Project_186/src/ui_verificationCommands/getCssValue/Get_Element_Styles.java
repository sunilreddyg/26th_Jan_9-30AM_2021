package ui_verificationCommands.getCssValue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Element_Styles {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement Roundtrip_Label=driver.findElement(By.xpath("//label[.='Round Trip']"));
		Roundtrip_Label.click(); //Selecting radio button using label
		Thread.sleep(3000);
		
		
		String text_color=Roundtrip_Label.getCssValue("color");
		System.out.println(text_color);
		
		
		if(text_color.equals("rgba(255, 0, 0, 1)"))
			System.out.println("Rondrip is selected");
		else
			System.out.println("Roundtrip is not selected");
		
		
		//Get Font size
		String Font_size=Roundtrip_Label.getCssValue("font-size");
		System.out.println("Font size of text is ---> "+Font_size);
		
		
		

	}

}
