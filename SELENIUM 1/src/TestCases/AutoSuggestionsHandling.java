package TestCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionsHandling {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./divs/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("pen");
		List<WebElement> autosuggestions=driver.findElements(By.xpath("//input[@name='q']/../../..//ul/li/div"));
		System.out.println(autosuggestions.size());
		int count=0;
		for(WebElement ele:autosuggestions) {
			count++;
			String s1=ele.getAttribute("data-tkid");
			String s2=s1.substring(36);
			System.out.println(s2  +"  is the  "+count+" auto suggestion ");
		}	
	}

}





//OUTPUT

//8
//.phone|Mobiles  is the  1 auto suggestion 
//.mobiles  is the  2 auto suggestion 
//.shoes  is the  3 auto suggestion 
//.t shirts  is the  4 auto suggestion 
//.pens  is the  5 auto suggestion 
//.pendrive 128  is the  6 auto suggestion 
//.pencil pouches  is the  7 auto suggestion 
//.pen drives  is the  8 auto suggestion 
