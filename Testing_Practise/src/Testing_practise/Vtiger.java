package Testing_practise;

import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.reactor.Command.Priority;
import org.apache.poi.util.Units;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utility.SeleniumUtility;

public class Vtiger extends SeleniumUtility {
  @Test(priority = 0)
  public void VtigerDemo () {
	  
	 driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
	  //enter the login credential for vtiger 
	  WebElement username =driver.findElement(By.name("username"));
	  username.clear();
	  username.sendKeys("admin");
	  
	  WebElement password =driver.findElement(By.name("password"));
	  password.clear();
	  password.sendKeys("Test@123");
	  WebElement signin =driver.findElement(By.cssSelector("button[class='button buttonBlue']"));
	  signin.click();
	  
	   
     //click the dashboard menu
	  WebElement dashboardMenu =driver.findElement(By.cssSelector("span[class='app-icon fa fa-bars']"));
	  dashboardMenu.click();	   
  }
  
  @Test(priority = 2)
  public void MarketingSelect () {
	  clickOnElement(driver.findElement(By.cssSelector("#appnavigator")));
	  clickOnElement(driver.findElement(By.xpath("//span[contains(text(),'MARKETING']")));
	  clickOnElement(driver.findElement(By.xpath("//a[@title='Leads']")));
	
  }

}
