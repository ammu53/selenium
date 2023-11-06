package TestCases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupsConfirmation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./divs/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.findElement(By.id("confirmBox")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		/////****** we handle the confirm popups by using accept or dismiss methods*****//////
		alert.dismiss();		
	///	alert.accept();
	}
}
