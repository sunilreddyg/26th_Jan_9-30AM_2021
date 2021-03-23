package page_objectModel_Element_Declaration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Run_Test {

	public static void main(String[] args) {
		
		
		//Browser Initation
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();					
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		/*
		 * Get @FindBy or @FindAll annotated method,Use Pagefactory class
		 */
		Element_Declaration Ref=PageFactory.initElements(driver, Element_Declaration.class);
		
		int Bys_obj=Ref.Bys_Group_Objects.size();
		System.out.println("Object count for By's commands is --> "+Bys_obj);
		
		
		int All_obj=Ref.Group_objects.size();
		System.out.println("Object count for All_obj commands is --> "+All_obj);
		
		
	}

}
