package interactions.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Context_click {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		
		WebElement Context_Element=driver.findElement(By.xpath("//span[.='right click me']"));
		//Perform right click action on selected element
		new Actions(driver).contextClick(Context_Element).perform();
		Thread.sleep(4000);
		
		WebElement Delete_btn=driver.findElement(By.xpath("//span[.='Delete']"));
		Delete_btn.click();
		Thread.sleep(4000);
		
		driver.switchTo().alert().accept();  //This command close alert window
		
		
		

	}

}
