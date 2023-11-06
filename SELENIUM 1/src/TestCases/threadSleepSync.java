package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class threadSleepSync {

	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "./divs/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(30000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(2000);
		driver.quit();
	}
	
}
