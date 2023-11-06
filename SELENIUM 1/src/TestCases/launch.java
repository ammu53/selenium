package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("C:\\Users\\ABHI\\Downloads\\MultipleWindow (1).html");

		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(12000);
		driver.quit();
		
	}

}
