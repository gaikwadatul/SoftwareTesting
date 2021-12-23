package keyboard_mouse_operation;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseoperation1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		 //action.moveToElement(freeBooklink).perform();
		//action.moveToElement(freeBooklink,100,03).perform();		
		//Actions action=new Actions(driver);
		WebElement freeBooklink=driver.findElement(By.xpath("//a[text()='Free Ebooks']"));	    
	    mouseHover("target", driver, freeBooklink, 100, 0);
	    Thread.sleep(2000);
	    mouseHover("targetWithCords", driver, freeBooklink, 100, 0);
	    Thread.sleep(2000);
	    mouseHover("cordsOnly", driver, freeBooklink, 100, 0);
	    Thread.sleep(2000);
	   
	}
	
	public static void mouseHover(String hoverOp,WebDriver driver,WebElement element,Integer x, Integer y) {
		Actions action = new Actions(driver);
				if(hoverOp.equalsIgnoreCase("target")) {
				action.moveToElement(element).perform();
			}else if(hoverOp.equalsIgnoreCase("targetWithCords")){
				action.moveToElement(element,x, y).perform();
				
			}else{
				action.moveByOffset(x, y).perform();
				
			}
	    }	

      }
	
