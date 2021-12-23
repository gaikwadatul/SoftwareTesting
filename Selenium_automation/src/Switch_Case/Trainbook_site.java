package Switch_Case;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utility.SeleniumUtility;

public class Trainbook_site extends SeleniumUtility{
  @Test
  public void Trainbok_Detail() {
	  driver=setUp("chrome", "https://etrain.info/station/Pune-Jn-PUNE/all");  
	  List<WebElement> list=driver.findElements(By.xpath("//table[contains(@class,'myTable')]//tr/td[1]/a"));
	  System.out.println(list.size());
    for(WebElement element:list) {
    	System.out.println(element.getText());
    }
  }
  
  @Test
  public void TestAd() throws InterruptedException {
	 driver=setUp("chrome", "http://www.indianrail.gov.in/enquiry/StaticPages/StaticEnquiry.jsp?StaticPage=index.html");
	 
	 driver.findElement(By.xpath("//a[text()='Services']")).click();
	 driver.findElement(By.xpath("//a[text()='Mobile Ticketing Services']")).click();
	 Thread.sleep(2000);
	 driver.switchTo().frame(driver.findElement(By.id("aswift_1")));
	 driver.switchTo().frame(driver.findElement(By.id("ad_iframe")));
	 //driver.findElement(By.xpath("//span[text()='close']")).click();
  }
 
}

