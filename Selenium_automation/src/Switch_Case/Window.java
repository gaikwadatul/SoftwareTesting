package Switch_Case;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utility.SeleniumUtility;

public class Window extends SeleniumUtility {
  @Test
  public void TestWindow() {
	  driver=setUp("chrome", "https://demoqa.com/browser-windows");
	  System.out.println("home window cureent url"+driver.getCurrentUrl());
	  //to get current window
	  String homewinId=driver.getWindowHandle();
	  System.out.println("Home window id: "+homewinId);
	  //click on butto  to open new window
	  driver.findElement(By.id("windowButton")).click();
	  //get the window id of all the browser window open by webdriver
	  Set<String> allwinIds= driver.getWindowHandles();
	  System.out.println("all win ids:"+allwinIds);
	  //get child window ids 
	  allwinIds.remove(homewinId);
	  System.out.println("all win ids after removing homewinid: "+allwinIds);
	
	  String childWinIds=allwinIds.iterator().next();
	  driver.switchTo().window(childWinIds);
	  System.out.println("after opening new tab/wndow,current url: "+driver.getCurrentUrl());
	   driver.close();
	  //once all child page operation are done come back to main page 
	  driver.switchTo().window(homewinId);
	  System.out.println("after coming back main page,current url: "+driver.getCurrentUrl());
	  //to close all the driver instance 
	  driver.close();
	//  driver.quit();
	  
  }
}
