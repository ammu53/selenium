package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementMethods91011 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./divs/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
////*****used to get display of webelement*****////		
//		WebElement loginbutton = driver.findElement(By.name("_97w4"));
//		boolean displayed=loginbutton.isDisplayed();
//		if(displayed==true)
//		{
//			System.out.println("is Displayed");
//		}
//		else
//		{
//			System.out.println("is not Displayed");
//		}
		
		
////*****used to get enable of webelement*****////		
		WebElement loginbutton = driver.findElement(By.name("login"));
		boolean enabled=loginbutton.isEnabled();
		if(enabled==true)
		{
			System.out.println("is Enabled");
		}
		else
		{
			System.out.println("is not Enabled");
		}
		
		
//		driver.get("https://www.facebook.com/signup");
	
//		WebElement femaleradiobutton= driver.findElement(By.xpath("//input[@type='radio' and @ value='1']"));
//		femaleradiobutton.click();
//		boolean selected=femaleradiobutton.isSelected();
//		if(selected==true)
//		{
//			System.out.println("is Selected");
//		}
//		else
//		{
//			System.out.println("is not Selected");
//		}
		
	}

}
