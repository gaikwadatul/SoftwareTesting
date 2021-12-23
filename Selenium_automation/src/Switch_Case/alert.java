package Switch_Case;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utility.SeleniumUtility;

public class alert extends SeleniumUtility {
  @Test
  public void Testalert() throws InterruptedException {
	  driver=setUp("chrome", "https://demoqa.com/alerts");
	   
	  //to open alert popup 
	  driver.findElement(By.id("alertButton")).click();
	  Thread.sleep(2000);
	  //switch your control to tlaert popup
	  String alertText=driver.switchTo().alert().getText();
	  System.out.println("Alert popup text: "+alertText);
	  //to accept alert to click on ok or yes button use
	  driver.switchTo().alert().accept();
		 
  }
}
