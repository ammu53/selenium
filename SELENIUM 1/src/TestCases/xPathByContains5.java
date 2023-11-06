package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathByContains5 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		  WebElement forgottenAccount= driver.findElement(By.xpath("//a[contains(text(),'Forgotten ')]"));
		  forgottenAccount.click();
		  
   Thread.sleep(5000);
  WebElement loginbutton=driver.findElement(By.partialLinkText("Log"));
  loginbutton.click(); 
   
  WebElement emailTextField= driver.findElement(By.xpath("//input[contains(@aria-label,'Email address')]"));
  emailTextField.sendKeys("abcd");

  WebElement passwordTextField= driver.findElement(By.xpath("//input[contains(@aria-label,'Password')]"));
  passwordTextField.sendKeys("wxyz");
  
 
    driver.get("https://www.facebook.com/login");
    WebElement signUpForFacebook = driver.findElement(By.xpath("//a[contains(text(),'Sign up for Facebook')]"));
   signUpForFacebook.click();
      
	}

}
