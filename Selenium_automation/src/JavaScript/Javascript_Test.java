package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utility.SeleniumUtility;

public class Javascript_Test extends SeleniumUtility {
  @Test
		public void testCase() throws InterruptedException {
	    WebDriver driver=setUp("chrome", "https://demo.actitime.com/login.do");		
		
	   //creating the javascript executor interface object by type casting 
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   
	   WebElement username=driver.findElement(By.id("username"));
	   username.sendKeys("admin");
	   WebElement password=driver.findElement(By.name("pwd"));
	   password.sendKeys("manager");
		
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		
		//perform click on login button using javascriptExecutor
		js.executeScript("arguments[0].click();", loginButton);
		
  }
}
