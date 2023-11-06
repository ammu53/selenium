package TestCases;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowser {

	

	public static void main(String[] args) throws Throwable {
	ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		String CurrentPageUrl=driver.getCurrentUrl();
		System.out.println(CurrentPageUrl);
		
		String TitleOfCurrentPage=driver.getTitle();
		System.out.println(TitleOfCurrentPage);
		
	 Point pos=driver.manage().window().getPosition();
	 int xcoordinate=pos.getX();
	 int ycoordinate=pos.getY();
	 System.out.println("The x coordinate is="+xcoordinate);
	 System.out.println("The y coordinate is="+ycoordinate);
	 
	 Dimension dim=driver.manage().window().getSize();
	 int width=dim.getWidth();
	 int height=dim.getHeight();
	 System.out.println("The width of window is="+width);
     System.out.println("The height of window is="+height);

	 
		Thread.sleep(5000);
		Options mang=driver.manage();
		Window win=mang.window();
		win.maximize();
		
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		
	}

}
 