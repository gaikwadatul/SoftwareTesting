package keyboard_mouse_operation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class vtiger {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement username=driver.findElement(By.name("username"));
	WebElement password=driver.findElement(By.name("password"));
	
	username.clear();
	Thread.sleep(2000);
	password.clear();
	Thread.sleep(2000);
	username.sendKeys("admin",Keys.chord(Keys.CONTROL,""));
	Thread.sleep(2000);
	username.sendKeys(Keys.chord(Keys.CONTROL,"c"));
	Thread.sleep(2000);
	password.sendKeys(Keys.chord(Keys.CONTROL,"v"));
	
	//WebElement submitbtn= driver.findElement(By.xpath("@buttontype='submit'"));
	//submitbtn.click();
	}

}
