package launch_browsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_FirefoxBrowser {

	public static void main(String[] args) 
	{
		/*
		 * Download geckodriver
		 * 		=> https://firefox-source-docs.mozilla.org/testing/geckodriver/Support.html
		 * 		=> Click on geckodriver releases
		 * 		=> Select geckodriver release w.r.t firefox browser
		 * 		=> Under Asserts download zip format file w.r.t Operating
		 * 					system and hotspot size  
		 * 		=>     for   >60 browser version download  [0.28.0] download geckodriver verision
		 * 		=> Downlaod zipformat file in backup folder
		 * 		=> Set runtime environment variable before launch firefox browser.
		 */
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.get("http://gmail.com");
	}

}
