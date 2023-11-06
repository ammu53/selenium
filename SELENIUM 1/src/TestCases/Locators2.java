package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		System.out.println("By findElement");
		WebElement firstInputElement=driver.findElement(By.tagName("input"));
		System.out.println(firstInputElement.getAttribute("name"));
		
		System.out.println("By findElements");
		List<WebElement>AllButtons=driver.findElements(By.tagName("input"));
		
		for(int i=0;i<AllButtons.size();i++) {
			String name = AllButtons.get(i).getAttribute("name");
			System.out.println(name);
		}
		driver.close();
		

	}

}
