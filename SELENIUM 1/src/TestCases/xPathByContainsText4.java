package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathByContainsText4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		  WebElement forgottenAccount= driver.findElement(By.xpath("//a[contains(text(),'Forgotten ')]"));
		  forgottenAccount.click();
		  
		 driver.get("https://www.facebook.com/login");
         WebElement signUpForFacebook = driver.findElement(By.xpath("//a[contains(text(),'Sign up for Facebook')]"));
		   signUpForFacebook.click();
		      
	}

}
