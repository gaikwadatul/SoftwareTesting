package Switch_Case;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.SeleniumUtility;

public class Switch_Case extends SeleniumUtility {
	
	static WebDriver driver;
  @Test
  public void TestElement() {
	  driver=setUp("chrome", "https://demo.actitime.com/login.do");
	  WebElement element=driver.switchTo().activeElement();
	  String act=element.getAttribute("placeholder");
	  Assert.assertEquals(act, "Username","By default control is not username field ");
	  element.sendKeys("admin",Keys.TAB);
	  driver.switchTo().activeElement().sendKeys("manage",Keys.ENTER);
	  
  }
}
