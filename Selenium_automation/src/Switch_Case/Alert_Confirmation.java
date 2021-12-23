package Switch_Case;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utility.SeleniumUtility;

public class Alert_Confirmation extends SeleniumUtility {
  @Test
  public void confirmation_alert() throws InterruptedException {
	  driver=setUp("chrome", "https://demoqa.com/alerts");
	   
	  //to open alert popup 
	  driver.findElement(By.id("confirmButton")).click();
	  Thread.sleep(2000);
	  //switch your control to tlaert popup
	  String confirmationPopupText=driver.switchTo().alert().getText();
	  System.out.println("Alert popup text: "+confirmationPopupText);
	  //to accept alert to click on ok or yes button use
	  driver.switchTo().alert().accept();
	  
	  //to dissmissed the operation to use
	//  driver.switchTo().alert().dismiss();
		 
  }
}
