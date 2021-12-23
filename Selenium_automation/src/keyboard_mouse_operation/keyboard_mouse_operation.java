package keyboard_mouse_operation;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboard_mouse_operation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.gsmarena.com/samsung-phones-9.php");
		driver1.manage().window().maximize();
		driver1.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
		//Thread.sleep(3000);
		driver1.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(3000);
		driver1.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(3000);
		driver1.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
		

	}

}
