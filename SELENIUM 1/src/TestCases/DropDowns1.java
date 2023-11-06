package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./divs/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/signup");
		
	    WebElement DayDropDown = driver.findElement(By.id("day"));
		Select selectDay=new Select (DayDropDown);
		selectDay.selectByIndex(4);
		
	    WebElement MonthDropDown = driver.findElement(By.id("month"));
		Select selectMonth=new Select (MonthDropDown);
		selectMonth.selectByValue("3");
			
	    WebElement YearDropDown = driver.findElement(By.id("year"));
		Select selectYear=new Select (YearDropDown);
		selectYear.selectByVisibleText("1998");
				
	}

}
