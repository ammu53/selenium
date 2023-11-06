package TestCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindows {

	public static void main(String[] args) throws Throwable
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("C:\\Users\\ABHI\\Downloads\\MultipleWindow (1).html");
	
	String WindowIdOfCurrentWindow=driver.getWindowHandle();
	System.out.println("current Window id before clicking"+WindowIdOfCurrentWindow);
	
	Set<String> AllWindowIds=driver.getWindowHandles();
	System.out.println("All the Window Ids before Clicking");
			for(String ref:AllWindowIds)
			{
				System.out.println(ref);
			}
	
	driver.findElement(By.tagName("input")).click();
	
	Thread.sleep(13000);
	String AfterclickWindowId=driver.getWindowHandle();
	System.out.println("current Window id after clicking"+AfterclickWindowId);
	
	Set<String> AllWindowIdsAfterClicking=driver.getWindowHandles();
	System.out.println("All the Window Ids after Clicking");
	for(String ref1:AllWindowIds)
	{
		System.out.println(ref1);
	}

	
	}
}