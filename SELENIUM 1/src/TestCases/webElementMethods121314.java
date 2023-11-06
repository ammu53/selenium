package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementMethods121314 {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./divs/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		  WebElement emailTextField= driver.findElement(By.id("email"));
		  emailTextField.sendKeys("alpha");
		  
		  
////*****used to get location of the weblement*****////		  
	 Point point = emailTextField.getLocation();
	 int xcoordinatevalue=point.getX();
	 int ycoordinatevalue=point.getY();
	 System.out.println("the x-coordinate value: " +xcoordinatevalue);
	 System.out.println("the y-coordinate value: " +ycoordinatevalue);	
	
	
////*****used to get height and width*****////	
	Dimension dimension = emailTextField.getSize();
	int heightvalue=dimension.getHeight();
	int widthvalue=dimension.getWidth();
	System.out.println("the height value: "+heightvalue);
	System.out.println("the width value: "+widthvalue);
	
////***** used to get rect*****////
	Rectangle rect = emailTextField.getRect();
	int height=rect.getHeight();
	int width=rect.getWidth();
	int xcoordinate=rect.getX();
	int ycoordinate=rect.getY();
	System.out.println("the height value: "+height);
	System.out.println("the width value: "+width);
	System.out.println("the x-coordinate value: "+xcoordinate);
	System.out.println("the y-coordinate value: "+ycoordinate);
	 
	}

}
