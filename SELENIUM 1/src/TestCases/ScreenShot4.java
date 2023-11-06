package TestCases;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ScreenShot4 {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","./divs/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File tempraryfile=ts.getScreenshotAs(OutputType.FILE);
		String time=LocalDateTime.now().toString().replace(':', '-');
		System.out.println(time);
		File permanentfile=new File("./ScreenShots/firstScreenShot4"+time+".jpeg");
		FileHandler.copy(tempraryfile, permanentfile);

				
	}

}
