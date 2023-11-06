package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./divs/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/frame-and-windows/");
		Actions action=new Actions(driver);
		action.moveByOffset(920, 83).perform();
	
		WebElement ebooksLink = driver.findElement(By.xpath("//a[contains(text(),'Free Ebooks')]"));
		action.moveToElement(ebooksLink).perform();
		
		WebElement cheatSheetsLink = driver.findElement(By.xpath("//a[text()='CheatSheets']"));
	    action.contextClick(cheatSheetsLink).perform();
	    
	    action.scrollByAmount(0, 1000).perform();
	    
	    	Thread.sleep(3000);
	}

}
