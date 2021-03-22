package pagefactory.With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Run_FB_Signin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		/*
		 * Inorder to get @findby methods in different class
		 * we should get it from pagefactory class
		 */
		FB_Signin fb_login=PageFactory.initElements(driver, FB_Signin.class);
		fb_login.user_login_Invalid_pwd();

	}

}
