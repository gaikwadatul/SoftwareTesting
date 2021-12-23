package Calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utility.SeleniumUtility;

public class Redbus_calender extends SeleniumUtility {
  @Test
  public void Redbus_Calender() {
	  driver=setUp("chrome","https://www.redbus.in/");
	  //enter the from location 
	  WebElement from_Date=driver.findElement(By.id("src"));
	  from_Date.sendKeys("mumbai");
	//enter the to location 	 
	  WebElement to_Date=driver.findElement(By.id("dest"));
	  to_Date.sendKeys("pune");
	  
	  //enter the date
	  driver.findElement(By.cssSelector("fl icon-calendar_icon-new icon-onward-calendar icon")).click();
	  
	  
  }
}
