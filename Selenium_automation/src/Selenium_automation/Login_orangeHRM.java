package Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_orangeHRM {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Java\\Workspace\\Selenium_automation\\Executable\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    WebElement UserName=driver.findElement(By.id("txtUsername"));
		UserName.sendKeys("Admin");
		WebElement Password=driver.findElement(By.id("txtPassword"));
		Password.sendKeys("admin123");
		WebElement SubmitButton=driver.findElement(By.id("btnLogin"));
		SubmitButton.click();
		
		System.out.println("Get title is :"+driver.getCurrentUrl());
		driver.close();  
	}

}
