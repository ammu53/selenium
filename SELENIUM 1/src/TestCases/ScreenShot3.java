package TestCases;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot3 {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./divs/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File tempraryfile=ts.getScreenshotAs(OutputType.FILE);
		File permanentFile=new File("./ScreenShots/firstScreenShot3.png");
		FileHandler.copy(tempraryfile, permanentFile);
		
		
	}

}
