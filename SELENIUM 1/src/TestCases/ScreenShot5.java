package TestCases;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot5 {

public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","./divs/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
		WebElement instaimage=driver.findElement(By.xpath("//i[@aria-label='Instagram']"));
		File tempfile=instaimage.getScreenshotAs(OutputType.FILE);
		String currentTime=LocalDateTime.now().toString().replace(':', '-');
		System.out.println(currentTime);
		File permfile=new File("./ScreenShots/Instabutton"+currentTime+".jpeg");
		FileHandler.copy(tempfile, permfile);
}
	
}
