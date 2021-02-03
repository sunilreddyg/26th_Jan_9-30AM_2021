package launch_browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome_Browser {

	public static void main(String[] args) 
	{
		
		/*
		 * Download chromedriver.exe file:-->
		 * 		URL:--> https://www.selenium.dev/downloads/
		 * 		=>At the bottom of page click on "+browsers"
		 * 		=>Under chrome click on Documentation [It opens chromedriver page]
		 * 		=>Under chrome downloads Select any chrome version 
		 * 				and download w.r.t chrome browser version
		 * 				Chromebrowser version ==> 88
		 * 				chromedriver version  ==> ChromeDriver 88.0.4324.96
		 * 		=>click on stabel version [it navigates to index page]
		 * 		=>choose operating system and download zip format file.
		 * 		=>After download save file into backup folder and unzip file
		 * 		=>for this action you receive chromedriver.exe file
		 * 		=>set runtime environment variable before launch chromebrowser	
		 */
		
		
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("http://google.com");
		
		System.out.println(chrome.getTitle());
		
		chrome.close();
		
		
	}

}
