package ui_verificationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Verification_Commands {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver page=new ChromeDriver();
		page.get("https://selenium.dev");
		page.manage().window().maximize();

		
		String page_title=page.getTitle();
		System.out.println("Current page title is ---> "+page_title);
		
		String Page_url=page.getCurrentUrl();
		System.out.println("Current page url is ---> "+Page_url);

		String Dynamic_Window_ID=page.getWindowHandle();
		System.out.println("Current Browser window ID--->"+Dynamic_Window_ID);
		
		String PageSource=page.getPageSource();
		System.out.println(PageSource);
	}

}
