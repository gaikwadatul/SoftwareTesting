package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utility.SeleniumUtility;

public class login_Testng extends SeleniumUtility{
  static WebDriver driver;
  @Test
  public void OpenBrowserandUrl() {
	  driver=setUp("chrome","https://demo.actitime.com/login.do");
  }
 
@Test
  public void login() {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
	  
  }
  
@Test
public void closeBrowser() {
	 
	//driver.close();
	System.out.println("close the application");
	cleanUp();
}
}
