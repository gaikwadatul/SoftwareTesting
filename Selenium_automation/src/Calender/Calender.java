package Calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utility.SeleniumUtility;

public class Calender extends SeleniumUtility {
  @Test
  public void Calender_Test() throws InterruptedException {
	  driver=setUp("chrome","https://demo.actitime.com/tasks/tasklist.do");
	  WebElement username=driver.findElement(By.id("username"));
	  username.sendKeys("admin");
	  WebElement password=driver.findElement(By.name("pwd"));
	  password.sendKeys("manager");
	  WebElement loginbtn=driver.findElement(By.id("loginButton"));
	  loginbtn.click();
	 
	  driver.findElement(By.cssSelector("div.title.ellipsis")).click();
	  driver.findElement(By.cssSelector("div.item.createNewTasks")).click();
	  driver.findElement(By.xpath("//tbody/tr[1]//tbody//button[text()='set deadline']")).click();
	  Thread.sleep(2000);
	  //current date
	  //driver.findElement(By.cssSelector(".x-date-selected>a")).click();
	 
	  //future date 
	  driver.findElement(By.cssSelector(".x-date-right>a")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[text()='13']")).click();
	  
	  
	  cleanUp();
  }
  
}
