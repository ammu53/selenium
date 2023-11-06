package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementMethods5678 
{
	
	

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "./divs/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		  WebElement emailTextField= driver.findElement(By.id("email"));
		 String tagname=emailTextField.getTagName();
		 WebElement loginbutton=driver.findElement(By.linkText("Log in"));
		 System.out.println(tagname);
		 String attvalue=emailTextField.getAttribute("type");
		 System.out.println(attvalue);
		 String text=loginbutton.getText();
		 System.out.println(text);
		 String colour=loginbutton.getCssValue("color");
		 System.out.println(colour);
		 
	}

}
