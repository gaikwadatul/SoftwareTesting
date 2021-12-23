package Selenium_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basic_locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\Software Testing\\Java\\Workspace\\Selenium_automation\\Executable\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.google.com");
	    System.out.println("view current url is "+driver.getCurrentUrl());
	    System.out.println("view page title url is "+driver.getTitle());
	   // System.out.println("view page source url is "+driver.getPageSource());
	    System.out.println("view current url is "+driver.manage().window().getSize());
	    System.out.println("view class is "+driver.manage().window().getClass());
	    
	    
	    driver.close();

	}

}
