package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utility.SeleniumUtility;

public class JavascriptDemo2 extends SeleniumUtility {
  @Test
  public void f() {
	  WebDriver driver=setUp("chrome", "https://www.browserstack.com/users/sign_in");		
		
	   //creating the javascript executor interface object by type casting 
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   
	   js.executeScript("document.getElementById('user_email_login').value='abc@xyz.com';");
	   js.executeScript("document.getElementById('user_password').value='password';");
	   js.executeScript("document.getElementById('user_submit').click();");
	                    //or
	 //  WebElement login=driver.findElement(By.id("user_submit"));
	 //  js.executeScript("arguments[0].click();", login);
		
	//   js.executeScript("alert('Enter the correct login detail');");
		
	   
    }
}
