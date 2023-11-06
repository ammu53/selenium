package TestCases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SreenShot1 {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./divs/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		File tempraryfile=driver.getScreenshotAs(OutputType.FILE);
		File permanentFile=new File("./ScreenShots/firstScreenShot.png");
		FileHandler.copy(tempraryfile, permanentFile);
		

	}

}
