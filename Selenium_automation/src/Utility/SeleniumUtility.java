package Utility;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOExceptionList;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumUtility {
	
public static WebDriver driver;
public static Actions action;
public static WebDriverWait wait;

 public WebDriver setUp(String browserType, String appUrl1) {
		if(browserType.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browserType.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else {
			
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    wait=new WebDriverWait(driver,20);
	    driver.get(appUrl1);
	    return driver;
  }
  public void tearDown() {
	driver.close();
	
   }

   public void getScreenShot(String fileName) {
	
	   TakesScreenshot ts=(TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file,new File(fileName));	
		}catch(IOException e) {
			e.printStackTrace();
		}
			   
   }
   public void mouseHover(String hoverOp, WebElement element,Integer x, Integer y) {
	   Actions action = new Actions(driver);
		if(hoverOp.equalsIgnoreCase("target")) {
		action.moveToElement(element).perform();
	}else if(hoverOp.equalsIgnoreCase("targetWithCords")){
		action.moveToElement(element,x, y).perform();
		
	}else{
		action.moveByOffset(x, y).perform();
		
	}
}	
   
   public void perFormMouseOverOperation(WebElement element) {
	  action.moveToElement(element).perform(); 
   }
   public void perFormRightClickOperation(WebElement element) {
		  action.moveToElement(element).contextClick().build().perform();
	   }
   
   public void perFormDragAndDrop(WebElement source,WebElement target) {
		  action.dragAndDrop(source, target).build().perform();
	   }
   
  public void cleanUp() {
	  driver.close();
    } 
  
 protected void setsleepTime(long millis) {
	 try {
		 Thread.sleep(millis);
	 }catch(InterruptedException e) {
		 
	 }
	 
 }	 
	protected void refreshPage() {
		driver.navigate().refresh();
		
	}
	
 } 
  
  
  
  
  
  
  
}
