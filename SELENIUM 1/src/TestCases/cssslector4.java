package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssslector4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		/////*****general syntax of cssselector****////
	//	WebElement help = driver.findElement(By.cssSelector("a[href='/help/?ref=pf']"));
	//	help.click();
	
		
		/////*****using id attribute of cssselector*****/////
		WebElement inputTextField = driver.findElement(By.cssSelector("input#email"));
		inputTextField.sendKeys("alpha");
		
		
		/////*****using class attribute of cssselector*****/////
	//    WebElement emailTextfield = driver.findElement(By.cssSelector("a._sv4"));
	//	emailTextfield.click();
	}

}
