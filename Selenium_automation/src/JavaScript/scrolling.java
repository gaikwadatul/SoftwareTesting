package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utility.SeleniumUtility;

public class scrolling extends SeleniumUtility {
  @Test
  public void scrolling1() throws InterruptedException {
	  
	  WebDriver driver=setUp("chrome", "https://www.flipkart.com/");		
	driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);	
	   //creating the javascript executor interface object by type casting 
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   Thread.sleep(2000);
	  js.executeScript("window.scrollBy(0,1000)");
	  
	 
	//full scroll up eleement is found 
	//js.executeScript("arguments[0].scrollIntoView();", webelement);
	 
	//  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		   
  }
}
