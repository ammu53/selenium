package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementMethods1234 {

	public static void main(String[] args) throws Throwable {
	
		System.setProperty("webdriver.chrome.driver", "./divs/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		  WebElement emailTextField= driver.findElement(By.id("email"));
		  emailTextField.sendKeys("alpha");
		  Thread.sleep(3000);
		  emailTextField.sendKeys("beta");
		  Thread.sleep(3000);
		  
		  WebElement passwordTextField= driver.findElement(By.xpath("//input[@name='pass']"));
		  passwordTextField.sendKeys("gamma");
		  Thread.sleep(3000);
		  passwordTextField.sendKeys("delta");
		  Thread.sleep(3000);
		  
          Thread.sleep(3000);
          passwordTextField.clear();
          
          WebElement loginbutton=driver.findElement(By.xpath("//button[text()='Log in']"));
          loginbutton.submit();
	
	}

}
