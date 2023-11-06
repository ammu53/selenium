package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathByContainsAttribute3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
			
        WebElement emailTextField= driver.findElement(By.xpath("//input[contains(@aria-label,'Email address')]"));
        emailTextField.sendKeys("abcd");
        
        WebElement passwordTextField= driver.findElement(By.xpath("//input[contains(@aria-label,'Password')]"));
        passwordTextField.sendKeys("wxyz");

	}

}
