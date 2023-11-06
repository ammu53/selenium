package TestCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./divs/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/signup");
		
	    WebElement DayDropDown = driver.findElement(By.id("day"));
		Select selectDay=new Select (DayDropDown);
		boolean ref1=selectDay.isMultiple();
		if(ref1==false)
		{
			System.out.println("The day select drop down is single select");
		}
		else
		{
			System.out.println("The day select drop down is multiple select");
		}
		selectDay.selectByIndex(4);
		WebElement daySelectedOption=selectDay.getFirstSelectedOption();
		System.out.println("The selected day is :"+daySelectedOption.getText());
		
	    WebElement MonthDropDown = driver.findElement(By.id("month"));
		Select selectMonth=new Select (MonthDropDown);
		boolean ref2=selectDay.isMultiple();
		if(ref2==false)
		{
			System.out.println("The day select drop down is single select");
		}
		else
		{
			System.out.println("The day select drop down is multiple select");
		}
		selectMonth.selectByValue("3");
		WebElement monthSelectedOption=selectMonth.getFirstSelectedOption();
		System.out.println("The selected month is :"+monthSelectedOption.getText());
		
	    WebElement YearDropDown = driver.findElement(By.id("year"));
		Select selectYear=new Select (YearDropDown);
		boolean ref3=selectDay.isMultiple();
		if(ref3==false)
		{
			System.out.println("The day select drop down is single select");
		}
		else
		{
			System.out.println("The day select drop down is multiple select");
		}
		selectYear.selectByVisibleText("1998");
		WebElement yearSelectedOption=selectYear.getFirstSelectedOption();
		System.out.println("The selected year is :"+yearSelectedOption.getText());
		
		List<WebElement>AllDayDropDownOptions=selectDay.getOptions();
		int count1=1;
		for(WebElement option:AllDayDropDownOptions)
		{
			System.out.println("The "+count1+" option is "+option.getText());
			count1++;
		}
		List<WebElement>AllMonthDropDownOptions=selectMonth.getOptions();
		int count2=1;
		for(WebElement option:AllMonthDropDownOptions)
		{
			System.out.println("The "+count2+" option is "+option.getText());
			count2++;
		}
		List<WebElement>AllYearDropDownOptions=selectYear.getOptions();
		int count3=1;
		for(WebElement option:AllYearDropDownOptions)
		{
			System.out.println("The "+count3+" option is "+option.getText());
			count3++;
		}
	}
	
}

