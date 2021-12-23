package keyboard_mouse_operation;

import java.awt.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseoperation3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		try {
			driver.findElement(By.xpath("/body")).sendKeys(Keys.ESCAPE);
		}catch(NoSuchElementException e){
			
		}
		
	//List<WebElement> mainmenu= driver.findElement(By.xpath(""));	
	//div[@class='_37M3Pb']/div/a/div[2]/div[2]/div[2]/	
	}

}
