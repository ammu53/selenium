package TestCases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopupsFileUpload {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./divs/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
	     
		
	driver.get("https://kitchen.applitools.com/ingredients/file-picker");
	driver.findElement(By.id("photo-upload")).sendKeys("C:\\Users\\ABHI\\Desktop\\IMAGES\\1.jpg");
	

	 Actions action = new Actions(driver);
	action.scrollByAmount(0, 600).perform();
	
	
	
	
	
	
	
	

	}

}
