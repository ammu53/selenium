package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathByAttribute1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
			
	// WebElement createaPage = driver.findElement(By.xpath("//a[@class='_8esh']"));
	// createaPage.click();
	 
 //WebElement createaPage = driver.findElement(By.xpath("//a[@href='/pages/create/?ref_type=registration_form']"));
	// createaPage.click();
	 
	 
	 WebElement createNewAccount = driver.findElement(By.xpath("//a[@class ='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	 createNewAccount.click();
	}

}
