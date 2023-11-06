package TestCases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopupsFileUpload2 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./divs/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		Thread.sleep(5000);
		 Actions action = new Actions(driver);
		action.scrollByAmount(0, 600).perform();
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
	}

}
