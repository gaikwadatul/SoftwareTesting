package Webdrivermanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drivermanager {

	public static void main(String[] args) {
		//open browser without using path for firefox
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.close();
		
		//open browser without using path for firefox
		WebDriverManager.chromedriver().setup();
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://google.com");
		driver1.findElement(By.name("q")).sendKeys("selenium");
		driver1.close();

	}

}
