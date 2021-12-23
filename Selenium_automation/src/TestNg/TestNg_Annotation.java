package TestNg;

import org.testng.annotations.Test;

import Utility.SeleniumUtility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNg_Annotation extends SeleniumUtility {
   @BeforeTest
  public void setUp() {
	  driver=setUp("chrome","https://www.google.com");
	  System.out.println("open browser and login");
  }
 
  @Test
  public void TaskCreated_goglesearch() {
	  String expectedTitle="Google";
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle,"enter the meesage ");
	 //or System.out.println(expectedTitle.equals(actualTitle));
      System.out.println("google page is finished");
  }
  
  @Test
  public void TestSearch() {
	  driver.findElement(By.name("q")).sendKeys("SQL Question",Keys.ENTER);
	  System.out.println(driver.getTitle());
	  System.out.println("delete  a task");
  }
  @AfterTest
  public void afterTest_Close() {
	  cleanUp();
	  System.out.println("log out and close");
  }

 

}
