package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		

		WebElement EmailTextField = driver.findElement(By.id("Email"));
		EmailTextField.sendKeys("hello");
		
		WebElement PasswordTextField = driver.findElement(By.id("pass"));
		PasswordTextField.sendKeys("bye");
		
		WebElement loginButton = driver.findElement(By.id("login"));
		loginButton.click();
		
	}

}
