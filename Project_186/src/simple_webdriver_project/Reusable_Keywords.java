package simple_webdriver_project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reusable_Keywords 
{
	WebDriver driver;
	String Driver_path="Drivers\\";
	WebDriverWait wait;
	
	
	/*
	 * KeywordName:-->  Launch Browser
	 * Author:-->
	 * CratedOn:-->
	 * ReviewdBy:-->
	 * LastUdpated Date:-->
	 * Parameters Used:-->
	 */
	public void Launch_Browser(String Browsername)
	{
		switch (Browsername) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", Driver_path+"chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", Driver_path+"geckodriver.exe");
			driver=new FirefoxDriver();
			break;
			
		case "ie":
			System.setProperty("webdriver.ie.driver", Driver_path+"IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;

		default:System.out.println("browser name mismatch");
			break;
		}
	}
	
	
	
	/*
	 * KeywordName:-->  Load Webapge
	 * Author:-->
	 * CratedOn:-->
	 * ReviewdBy:-->
	 * LastUdpated Date:-->
	 * Parameters Used:-->
	 */
	public void Load_Webpage(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	
	/*
	 * KeywordName:-->  manage ImplicitWait
	 * Author:-->
	 * CratedOn:-->
	 * ReviewdBy:-->
	 * LastUdpated Date:-->
	 * Parameters Used:-->
	 */
	public void Set_implicit_Wait(int Time_in_seconds)
	{
		driver.manage().timeouts().implicitlyWait(Time_in_seconds, TimeUnit.SECONDS);
	}
	
	/*
	 * KeywordName:-->  Set Explicit Wait
	 * Author:-->
	 * CratedOn:-->
	 * ReviewdBy:-->
	 * LastUdpated Date:-->
	 * Parameters Used:-->
	 */
	public void set_explicit_wait(int Time_in_seconds)
	{
		wait=new WebDriverWait(driver, Time_in_seconds);
	}
	
	
	/*
	 * KeywordName:-->  Enter Text into Editbox[Default xpath Locator]
	 * Author:-->
	 * CratedOn:-->
	 * ReviewdBy:-->
	 * LastUdpated Date:-->
	 * Parameters Used:-->
	 */
	public void Enter_text(String Ele_xpath,String inputdata)
	{
		driver.findElement(By.xpath(Ele_xpath)).clear();
		driver.findElement(By.xpath(Ele_xpath)).sendKeys(inputdata);
	}
	
	
	/*
	 * KeywordName:-->  Enter Text into Editbox[Using By locator refernce]
	 * Author:-->
	 * CratedOn:-->
	 * ReviewdBy:-->
	 * LastUdpated Date:-->
	 * Parameters Used:-->
	 */
	public void Enter_text(By locator,String inputdata)
	{
		try {
			WebElement Editbox=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			Editbox.clear();
			Editbox.sendKeys(inputdata);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * KeywordName:-->  Enter Text into Editbox[Default xpath Locator]
	 * Author:-->
	 * CratedOn:-->
	 * ReviewdBy:-->
	 * LastUdpated Date:-->
	 * Parameters Used:-->
	 */
	public void Enter_text(WebElement Element,String inputdata)
	{
		try {
			WebElement Editbox=wait.until(ExpectedConditions.visibilityOf(Element));
			Editbox.clear();
			Editbox.sendKeys(inputdata);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * KeywordName:--> Select Dropdown[Default xpath Locator]
	 * Author:-->
	 * CratedOn:-->
	 * ReviewdBy:-->
	 * LastUdpated Date:-->
	 * Parameters Used:-->
	 */
	public void select_dropdown(String typeofselect,String Element_xpath,String inputvalue)
	{
		switch (typeofselect) {
		case "visibletext":
			new Select(driver.findElement(By.xpath(Element_xpath)))
			.selectByVisibleText(inputvalue);
			break;
			
		case "value":
			new Select(driver.findElement(By.xpath(Element_xpath)))
			.selectByValue(inputvalue);
			break;
			
		case "index":
			
			new Select(driver.findElement(By.xpath(Element_xpath)))
			.selectByIndex(Integer.valueOf(inputvalue));
			break;

		default:System.out.println("select type mismatch");
			break;
		}
	}
	
	
	
	/*
	 * KeywordName:--> Select Dropdown[Using By Locator]
	 * Author:-->
	 * CratedOn:-->
	 * ReviewdBy:-->
	 * LastUdpated Date:-->
	 * Parameters Used:-->
	 */
	public void select_dropdown(String typeofselect,By locator,String inputvalue)
	{
		switch (typeofselect) {
		case "visibletext":
			new Select(driver.findElement(locator))
			.selectByVisibleText(inputvalue);
			break;
			
		case "value":
			new Select(driver.findElement(locator))
			.selectByValue(inputvalue);
			break;
			
		case "index":
			
			new Select(driver.findElement(locator))
			.selectByIndex(Integer.valueOf(inputvalue));
			break;

		default:System.out.println("select type mismatch");
			break;
		}
	}
	
	
	
	/*
	 * KeywordName:--> Select Dropdown[POM keyword]
	 * Author:-->
	 * CratedOn:-->
	 * ReviewdBy:-->
	 * LastUdpated Date:-->
	 * Parameters Used:-->
	 */
	public void select_dropdown(String typeofselect,WebElement element,String inputvalue)
	{
		switch (typeofselect) {
		case "visibletext":
			new Select(element)
			.selectByVisibleText(inputvalue);
			break;
			
		case "value":
			new Select(element)
			.selectByValue(inputvalue);
			break;
			
		case "index":
			
			new Select(element)
			.selectByIndex(Integer.valueOf(inputvalue));
			break;

		default:System.out.println("select type mismatch");
			break;
		}
	}
	
	
	
	
	/*
	 * KeywordName:--> Click button,link,radiobutton,checkbox,listofitems ---etc
	 * Author:-->
	 * CratedOn:-->
	 * ReviewdBy:-->
	 * LastUdpated Date:-->
	 * Parameters Used:-->
	 */
	public void Click_Element(String Element_xpath)
	{
		try {
			wait.until(ExpectedConditions.
					visibilityOfElementLocated(By.xpath(Element_xpath))).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	/*
	 * KeywordName:--> Click button,link,radiobutton,checkbox,listofitems ---etc
	 * Author:-->
	 * CratedOn:-->
	 * ReviewdBy:-->
	 * LastUdpated Date:-->
	 * Parameters Used:-->
	 */
	public void Click_Element(By locator)
	{
		try {
			wait.until(ExpectedConditions.
					visibilityOfElementLocated(locator)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	/*
	 * KeywordName:--> [POM]Click button,link,radiobutton,checkbox,listofitems ---etc
	 * Author:-->
	 * CratedOn:-->
	 * ReviewdBy:-->
	 * LastUdpated Date:-->
	 * Parameters Used:-->
	 */
	public void Click_Element(WebElement Element)
	{
		try {
			wait.until(ExpectedConditions.
					visibilityOf(Element)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	 /*
	 * KeywordName:--> Mousehover on element.[Using Xpath locator]
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */	 
	 public void mousehover(String Element_xpath)
	 {
		 WebElement Element=driver.findElement(By.xpath(Element_xpath));
		new Actions(driver).moveToElement(Element).pause(2000).perform();
	 } 
	 
	
	 /*
	 * KeywordName:--> Mousehover on element.[POM framework]
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */	 
		 public void mousehover(WebElement Element)
		 {
			WebElement Hover_element=wait.until(ExpectedConditions.visibilityOf(Element));
			new Actions(driver).moveToElement(Hover_element).pause(2000).perform();
		 } 
	
	
		 /*
		 * KeywordName:--> Fileupload using robot class
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 public void FileUploading(String filepath)
		 {
		 	String text=filepath;
			//Select String
			StringSelection Stext=new StringSelection(text);
			//Get default system clipboard
			Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
			//set content to clipboard at runtime.
			clipboard.setContents(Stext, Stext);
			
			
			//Crate object for Robot class
			Robot robot=null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				e.printStackTrace();
			}
			robot.setAutoDelay(1000);
					
			//Press Ctrl+V to paste copied text into notepad file
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
					
			//Press enter key
			robot.keyPress(KeyEvent.VK_ENTER);
					
			//Release Control key
			robot.keyRelease(KeyEvent.VK_CONTROL);
	
		 }	 
		 
		 
		 
		 /*
		 * KeywordName:--> CaptureScreen using [Filename]
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 public void capturescreen(String imagename)
		 {
			try {
				 Thread.sleep(5000);
				//creating simple date format
				SimpleDateFormat df=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
				//get system default date
				Date d=new Date();
				//Convert system date using default format
				String time=df.format(d);
				
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("screens\\"+time+imagename+".png"));
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		 }
		 
			 
		 /*
		 * KeywordName:--> SwitchTo window
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 public void switchto_window(String Exp_windowtitle)
		 {
			 	//Get All dynamic window ID's
			 	Set<String> Allwindow_IDS=driver.getWindowHandles();
			
				//Iteate for all window times
				for (String EachWindowID : Allwindow_IDS) 
				{
					//Switch to Every window
					driver.switchTo().window(EachWindowID);
					//Capture every window title
					String Runtime_title=driver.getTitle();
					
					//Condition to accept on expected window title match
					if(Runtime_title.contains(Exp_windowtitle))
					{
						break;   //Stop Iteration and get execution control out of for loop.
					}
				  }		
			}
		 
		 
		 
		 /*
		 * KeywordName:--> Select Firstrow and Click link inside first cell
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 public void Click_FirstRow_Link_At_Table(String table_xpath)
		 {
			 	WebElement table=driver.findElement(By.xpath(table_xpath));
			 	table.findElements(By.tagName("tr"))
			 	.get(0)
			 	.findElements(By.tagName("td"))
			 	.get(0)
			 	.findElement(By.tagName("a")).click();
		 }
		 
		 
		 
		 /*
		 * KeywordName:--> Select Firstrow and Click link inside first cell
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 
		 public boolean is_title_presented(String Exp_title)
		 {
			 boolean flag=false;
			 try {
				 wait.until(ExpectedConditions.titleContains(Exp_title));
				 flag=true;
			} catch (Exception e) {
				e.printStackTrace();
			}

			 return flag;
			 
		 }
		 
		 
		 /*
		 * KeywordName:--> IsUrlPresented
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 public boolean  is_Url_Presented(String Exp_url)
		 {
			 boolean flag=false;
			 try {
				 wait.until(ExpectedConditions.urlContains(Exp_url));
				 flag=true;
			} catch (Exception e) {
				e.printStackTrace();
			}

			 return flag;
			 
		 }
		 
		 
		 
		 /*
		 * KeywordName:--> IsTextVisibleAt Webpage
		 * Description:--> Method can verify any visible text at webpage
		 * 					and return boolean value ture/false.
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	
		 public boolean is_text_visible_At_Webpage(String Exp_text)
		 {
			 String Page_visible_text=driver.findElement(By.tagName("body")).getText();
			 boolean flag=Page_visible_text.contains(Exp_text);
			 return flag;
		 }
		 
		 
		 /*
		 * KeywordName:--> Verify Element presented at source
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 	public boolean is_Element_presented(String Exp_elementSource)
		 	{
		 			String Runtime_pageSource=driver.getPageSource();
		 			boolean flag=Runtime_pageSource.contains(Exp_elementSource);
		 			return flag;
		 	}
			 
		 
		 	 /*
			 * KeywordName:--> Verify Element presented using try catch
			 * Author:-->
			 * CreatedOn;-->
			 * ReviewedBy:-->
			 * Parameters used:--> Local
			 * LastUpdationDate:-->
			 */	 
		 	
		 	public boolean is_Element_presented_using_locator(String Element_Xpath)
		 	{
		 		boolean flag=false;
				 try {
					 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Element_Xpath)));
					 flag=true;
				} catch (Exception e) {
					e.printStackTrace();
				}

				 return flag;
		 	}
		 	
		 	
	 	/*
		 * KeywordName:--> Verify text presented at element.
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 	public boolean is_text_presented_At_Element(By locator,String exp_text)
		 	{
		 		boolean flag=false;
		 		try {
		 			 flag= wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, exp_text));
				} catch (Exception e) {
					return flag;
				}
		 		
		 		return flag;
		 	}
		 	
		 	
		 	/*
			 * KeywordName:--> Verif expected input available at editbox
			 * Author:-->
			 * CreatedOn;-->
			 * ReviewedBy:-->
			 * Parameters used:--> Local
			 * LastUpdationDate:-->
			 */	 
		 	public boolean isInput_presented_At_Editbox(By locator,String input)
		 	{
		 		try {
		 			boolean flag=wait.until(ExpectedConditions.textToBePresentInElementValue(locator, input));
		 			return flag;
				} catch (Exception e) {
					return false;
				}
		 		
		 	}
		 	
		 	
		 	
	 	/*
		 * KeywordName:--> Method verify alert presented at webpage
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	
		 	public boolean isAlert_Presented()
		 	{
		 		try {
					driver.switchTo().alert();
					return true;
				} catch (NoAlertPresentException e) {
					System.out.println(e.getMessage());
					return false;
				}
		 	} 	
		 	
		 	
	 	/*
		 * KeywordName:--> Method  verify Expected text presented at alert
		 * 				  and close alert window
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	
	 	public boolean is_alert_text_presented(String exp_alert_text)
	 	{
	 		boolean flag=false;
	 		if(isAlert_Presented())
	 		{
	 			String Runtime_alert_text=driver.switchTo().alert().getText();
	 			flag=Runtime_alert_text.contains(exp_alert_text);
	 			driver.switchTo().alert().accept();
	 			return flag;
	 		}
	 		else
	 		{
	
	 			return flag;
	 		}
	 	}
	 	
	 	
	 	
				
}
		 
		