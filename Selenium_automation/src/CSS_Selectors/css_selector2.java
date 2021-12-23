package CSS_Selectors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selector2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Java\\Workspace\\Selenium_automation\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("title view"+driver.getTitle());
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//login username
		WebElement entername =driver.findElement(By.id("username"));
		entername.sendKeys("admin");
		
		//login passworod
		WebElement password =driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		System.out.println("title view"+driver.getTitle());
		
		
		//submit button
		WebElement clickbtn =driver.findElement(By.id("loginButton"));
		clickbtn.click();
		//explicitly wait
		//Thread.sleep(2000);
		
		//logout button
		WebElement logouLink =driver.findElement(By.id("logoutLink"));
		logouLink.click();
		
		driver.close();
	}

}
