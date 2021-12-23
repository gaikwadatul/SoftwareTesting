package Switch_Case;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Utility.SeleniumUtility;

public class Frames extends SeleniumUtility {
  @Test
  public void f() throws InterruptedException {
	  driver=setUp("chrome", "https://jqueryui.com");
	  driver.findElement(By.xpath("//a[text()='Autocomplete']")).click();
	  driver.switchTo().frame(0);
	  
	  driver.findElement(By.cssSelector("input#tags")).sendKeys("ja");
	  Thread.sleep(2000);
	  driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN,Keys.ENTER); 
	  
   //coming back to main page from the page
	 driver.switchTo().defaultContent();
	  driver.findElement(By.cssSelector(".logo")).click();
	 cleanUp(); 
	  
  }
}
