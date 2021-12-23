package Switch_Case;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utility.SeleniumUtility;

public class Alert_prompt extends SeleniumUtility {
  @Test
  public void f() throws InterruptedException {
	  driver=setUp("chrome", "https://demoqa.com/alerts");
	   
	  //to prompt alert popup 
	  driver.findElement(By.id("promtButton")).click();
	  Thread.sleep(2000);
	  //switch your control to tlaert popup
	  System.out.println(driver.switchTo().alert().getText());
	  //to accept alert to click on ok or yes button use
	  driver.switchTo().alert().sendKeys("Selenium testing ");
	 driver.switchTo().alert().accept(); 
  }
}
