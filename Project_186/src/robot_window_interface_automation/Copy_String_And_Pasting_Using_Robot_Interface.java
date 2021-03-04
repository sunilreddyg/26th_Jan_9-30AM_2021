package robot_window_interface_automation;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Copy_String_And_Pasting_Using_Robot_Interface {

	public static void main(String[] args) throws Exception
	{
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		String text="Web Automation: Selenium WebDriver and Python — Getting Started — Part 3";
		
		//This three lines copy selected text into clipboard
		
		//select string
		StringSelection stext=new StringSelection(text);
		//Enable system clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Set content to clipboard
		clipboard.setContents(stext, stext);
		
		//Create object for robot class
		Robot robot=new Robot();
		robot.setAutoDelay(100);
		
		//Press Ctrl+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release Down key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		

	}

}
