package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Options 
{

	public static void main(String[] args) throws InterruptedException {
		
		
		/*
		 * Example:--> verify expected cities displayed
		 * 	w.r.t state selection.
		 */
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
				
		String Exp_cities[]= 
			{
				"South Andaman",		
				"Anantapur",
				"East Siang",
				"Darrang",
				"Banka",
				"Chandigarh",
				"Durg",
				"Dadra",
				"Daman",
				"New Delhi",
				"South Goa"
			};
		
		
		WebElement State_Dropdown=driver.findElement(By.id("customState"));
		List<WebElement> All_States=State_Dropdown.findElements(By.tagName("option"));
		All_States.remove(0);
		
		if(!All_States.isEmpty())
		{
				for (int i = 0; i < 11 ; i++) 
				{
					WebElement EachState=All_States.get(i);
					String StateName=EachState.getText();
					EachState.click();
					Thread.sleep(4000);
					
					//Loacate State dropdown and Capture entire text init
					WebElement City_dropdown=driver.findElement(By.id("customCity"));
					String State_Related_Cities=City_dropdown.getText();
				
					//Verify In total text expected city available
					if(State_Related_Cities.contains(Exp_cities[i]))
					{
						new Select(City_dropdown).selectByVisibleText(Exp_cities[i]);
						System.out.println("for-> "+StateName+"    City Option displayed---> "+Exp_cities[i]);
					}
					else
					{
						System.out.println("for-> "+StateName+"   City Option not displayed---> "+Exp_cities[i]);
					}
					
					
					
				}
			
		}
		else
			System.out.println("State drodpown options are empty");
		
		


	}

}
