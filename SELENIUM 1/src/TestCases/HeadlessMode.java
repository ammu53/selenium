package TestCases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessMode {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./divs/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	//	options.addArguments("--disable-notifications");
   //	options.addArguments("--headless");
		ChromeDriver driver = new ChromeDriver(options);
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		driver.findElement(By.id("alertBox")).click();
		driver.switchTo().alert().accept();
		System.out.println("test case is pass");
				
	}

}
