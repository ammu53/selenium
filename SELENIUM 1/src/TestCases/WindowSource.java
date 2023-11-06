package TestCases;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSource {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://en.wikipedia.org/wiki/Threads_(social_network)");
	
	String ref=driver.getPageSource();
	System.out.println(ref);
}
}
