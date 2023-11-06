package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathByText2 {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
				
          //  WebElement forgotPassword = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
        //   forgotPassword.click();
            
           // WebElement createAPage = driver.findElement(By.xpath("//a[text()='Create a Page']"));
          //  createAPage.click();
            
            WebElement  faceBookLite= driver.findElement(By.xpath("//a[text()='Facebook Lite']"));
            faceBookLite.click();
            
	}

}
