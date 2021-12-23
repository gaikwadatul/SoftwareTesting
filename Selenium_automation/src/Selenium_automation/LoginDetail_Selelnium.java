package Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDetail_Selelnium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Java\\Workspace\\Selenium_automation\\Executable\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		
	    //Enter URl
		driver.get("https://www.facebook.com/login/");
		
		/**
		 * find eleement (BY) is uset to identify eleement from the webpage it taken "BY" class as an urguement 
		 * and return webelelement 
		 * By: 'By'class is pre defined selenium class which several static method in it,those static method
		 *are known as locator in selenium
		 *driver.findeleement(By) 
		 *locators supported by selenium
		 *  1. Id(String)  2. name(String)  3.ClassName(String) 4. tagName(String) 5. linkText(String) 6.PartialLinkText(String)
		 *  7. cssSelector(String)  8.zpath(String)
		 *  driver.findElement(By)
		 *  Action: 1.typing : sendKeys("")
		 *          2. click : click
		 *          3.deleting text :clear()
		 */
		
		
		//Enter Username and perform required action(typing username field)
		WebElement UserName=driver.findElement(By.id("email"));
		UserName.sendKeys("9665417393");
		
		//Enter password and perform required action(typing password field)
		WebElement Password=driver.findElement(By.id("pass"));
		Password.sendKeys("A9665417393");
	
		//click on login button perform required action(clicking button field)
		WebElement loginButton=driver.findElement(By.name("login"));
		loginButton.click();	
		
		
		System.out.println("Get Title Is :"+driver.getTitle());
		System.out.println("Get URL is:"+driver.getCurrentUrl());
		driver.close();		
	}
	

}
