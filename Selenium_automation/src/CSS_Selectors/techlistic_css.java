package CSS_Selectors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class techlistic_css {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Java\\Workspace\\Selenium_automation\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement clickbutton =driver.findElement(By.cssSelector("li[class=overflowable-item]"));
		clickbutton.click();
		
		//driver.close();

	}

}
