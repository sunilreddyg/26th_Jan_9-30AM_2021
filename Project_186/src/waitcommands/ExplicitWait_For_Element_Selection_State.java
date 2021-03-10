package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_For_Element_Selection_State {

	public static void main(String[] args) 
	{
		
		
		/*
		 * Note:--> This waits only works for checkboxes and radio buttons
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		System.out.println("Browser is up and running");
		
		
		
		WebElement Roundtrip_Rbtn=driver.findElement(By.xpath("//input[@id='RoundTrip']"));
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementSelectionStateToBe(Roundtrip_Rbtn, true));
		System.out.println("Roundtrip radio button selection state is true");
		
		
		
		new WebDriverWait(driver, 40).until(ExpectedConditions.elementSelectionStateToBe(Roundtrip_Rbtn, false));
		System.out.println("Roundtrip radio button selection state is false");

		//ElementTobeselected :--> This method verify only true condition
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeSelected(Roundtrip_Rbtn));
		System.out.println("Roundtrip radio button selection state is true");
		
		
	}

}
