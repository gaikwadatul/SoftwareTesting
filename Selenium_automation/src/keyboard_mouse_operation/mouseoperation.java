package keyboard_mouse_operation;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseoperation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		Actions action=new Actions(driver);
		WebElement freeBooklink=driver.findElement(By.xpath("//a[text()='Free Ebooks']"));
	    
		action.moveToElement(freeBooklink).perform();
		action.moveToElement(freeBooklink,100,03).perform();		
	}
	public static void mouseHover(String hoverOp,Actions action,WebElement element,int x, int y) {
	
	/*	if(!(element==null || !(x=null)) {
		if(hoverOp.equalsIgnoreCase("target")) {
			action.moveToElement(element).perform();
		}else if(hoverOp.equalsIgnoreCase("targetWithCords")){
		}	
		}else {
			
		}
		}	
*/
	}
}
