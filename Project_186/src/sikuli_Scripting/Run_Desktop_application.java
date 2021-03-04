package sikuli_Scripting;


import org.sikuli.script.Screen;

public class Run_Desktop_application {

	public static void main(String[] args) throws Exception 
	{
		
		String image_location="D:\\new sikuli\\images\\";
		Thread.sleep(10000);
		Screen screen=new Screen();
		screen.doubleClick(image_location+"Chrome_img.png");
	}

}
