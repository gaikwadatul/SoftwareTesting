package Selenium_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Java\\Workspace\\Selenium_automation\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//login username
		WebElement userNameInputField =driver.findElement(By.id("username"));
		
		System.out.println("Username field is visibled"+userNameInputField.isDisplayed());
		System.out.println("Username field is editable or not"+userNameInputField.isEnabled());
		System.out.println("placeholder value of user name field"+userNameInputField.getAttribute("Placeholder"));
		
		//submit button
		WebElement loginbutton =driver.findElement(By.id("loginButton"));
		loginbutton.click();
		System.out.println("Button display status"+loginbutton.isDisplayed());
		System.out.println("Username clickable status"+loginbutton.isEnabled());
		System.out.println("Button name"+loginbutton.getText());
		
		WebElement checkbox=driver.findElement(By.id("keepLoggedCheckBox"));
		System.out.println("Checkbox field is visibility:"+checkbox.isDisplayed());
		System.out.println("Checkbox field is editable or not"+checkbox.isEnabled());
		System.out.println("Checkbox field is selected or not"+checkbox.isSelected());
		checkbox.click();
		System.out.println("Checkbox field is selected or not"+checkbox.isSelected());
		
		
	}

}
