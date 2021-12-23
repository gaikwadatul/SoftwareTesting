package Selenium_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown_Select {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Java\\Workspace\\Selenium_automation\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
        driver.switchTo().frame("iframeResult");
        WebElement dropdownlist=driver.findElement(By.name("cars"));
        
	}

}
