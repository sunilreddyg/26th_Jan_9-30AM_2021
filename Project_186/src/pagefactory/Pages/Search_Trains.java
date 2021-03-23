package pagefactory.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Trains {

	WebDriver driver;
	public Search_Trains(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(xpath = "//input[@id='from_station']")
	public WebElement From_AEB;
	
	@FindBy(xpath = "//input[@id='to_station']")
	public WebElement To_AEB;
	
	@FindBy(xpath = "//select[@id='trainClass']")
	public WebElement Select_Train_classType;
	
	//InputData
	public String page_title="IRCTC Train Tickets Online Booking at Cleartrip.com";
	
	
	/*
	 * Method to verify page title 
	 */
	public void Verify_Cleartrip_Trains_page_title()
	{
		boolean flag=driver.getTitle().contains(page_title);
		if(flag==true)
		{
			System.out.println("page title verfied");
		}
		else
		{
			System.out.println("page title not verified");
		}
	}
	
	

}
