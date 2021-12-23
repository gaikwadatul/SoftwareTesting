package keyboard_mouse_operation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation_demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
	WebElement firstname=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
	WebElement lastname=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
	
	firstname.clear();
	lastname.clear();
	Thread.sleep(2000);
	firstname.sendKeys("Atul",Keys.chord(Keys.CONTROL,"a"), Keys.chord(Keys.CONTROL,"c"));
	Thread.sleep(2000);
	lastname.sendKeys(Keys.chord(Keys.CONTROL,"v"));
	driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, Keys.END));
	lastname.sendKeys(Keys.TAB);
	

	}

}
