package TestCases;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopupsNotification2 {

	public static  void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./divs/chromedriver.exe");
		
		////****Blocking the Notification Popups before launching the browser*****////
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
		driver.get("https://in.puma.com/in/en");
		
	
	}
	
}
