package TestDemo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.SeleniumUtility;



public class TestActittme extends SeleniumUtility {
	@Test
	public void testCase() throws InterruptedException {
    WebDriver driver=setUp("chrome", "https://demo.actitime.com/login.do");		
	Thread.sleep(2000);
    WebElement username=driver.findElement(By.id("username"));
	username.sendKeys("admin");
	
	WebElement password=driver.findElement(By.name("pwd"));
	password.sendKeys("manager");
	
	WebElement login=driver.findElement(By.id("loginButton"));
	login.click();
	Thread.sleep(2000);
	
	}

}
