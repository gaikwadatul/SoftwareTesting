package Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WithoutUnique_locator {

	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver", "E:\\Software Testing\\Java\\Workspace\\Selenium_automation\\Executable\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		
	    //Enter URl
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement FirstName= driver.findElement(By.tagName("input"));
		FirstName.sendKeys("Atul");
		//last name w`ill be types in first name field selenium is not able to identify it uniquely
		WebElement LastName= driver.findElement(By.tagName("input"));
		LastName.sendKeys("Gaikwad");
	}

}
