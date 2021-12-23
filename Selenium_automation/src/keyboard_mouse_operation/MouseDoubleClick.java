package keyboard_mouse_operation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseDoubleClick {

	public static void main(String[] args) {
		//WebDriver driver= Utils.setup("chrome","http://vtiger-demo.it-solutions4you.com/index.php");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://vtiger-demo.it-solutions4you.com/index.php");
		WebElement userName= driver.findElement(By.id("username"));
		Actions action =new Actions(driver);
		//select the perform double click
		action.doubleClick(userName).build().perform();
		//rightbutton clcick
		action.contextClick(userName).build().perform();
	
	    action.clickAndHold(userName).build().perform();
	    
	    action.moveToElement(userName).release().build().perform();
	}

}
