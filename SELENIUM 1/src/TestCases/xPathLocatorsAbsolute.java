package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathLocatorsAbsolute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
			
		WebElement inputTextField = driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div/div/div/form/div/div/input"));
		inputTextField.sendKeys("alpha");
		
		WebElement passwordTextField = driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div/div/div/form/div/div/div/input"));
		passwordTextField.sendKeys("pass");
		
	}

}
