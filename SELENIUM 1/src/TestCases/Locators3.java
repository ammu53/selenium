package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//WebElement facebookLiteLink=driver.findElement(By.linkText("Facebook Lite"));
	//facebookLiteLink.click();
	
	//WebElement facebookLitePartialLink=driver.findElement(By.partialLinkText("Facebook Lite"));
	//facebookLitePartialLink.click(); 
	
	//WebElement Forgottenpassword=driver.findElement(By.partialLinkText("Forgotten password?"));
	//Forgottenpassword.click(); 
	
	
	}
}
