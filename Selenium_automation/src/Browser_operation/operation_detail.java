package Browser_operation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class operation_detail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","E:\\Software Testing\\Java\\Workspace\\Selenium_automation\\Executable\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.google.com");
	    //implicitly wait
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    WebElement entername =driver.findElement(By.cssSelector("input[class='gLFyf gsfi']"));
		entername.sendKeys("admin");
		
		//1.mininmize the winows
		driver.manage().window().setSize(new Dimension(500, 700));
		//explicitly wait
		Thread.sleep(2000);
		//2.refresh the url
		driver.navigate().refresh();
		Thread.sleep(2000);
		//3.foroward the website
		driver.navigate().forward();
		Thread.sleep(2000);
		//4.open the new url 
		driver.navigate().to("https://www.amazon.in/");
		//5.maximize the size
		driver.manage().window().maximize();
		
		//6.prevoius page open
		driver.navigate().back();
		
		//close the browser
		driver.close();
		
		}
}
