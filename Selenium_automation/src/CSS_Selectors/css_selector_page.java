package CSS_Selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selector_page {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Java\\Workspace\\Selenium_automation\\Executable\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	WebElement entername =driver.findElement(By.cssSelector("input[class='gLFyf gsfi']"));
	entername.sendKeys("facebook");
	
	WebElement clickbutton =driver.findElement(By.cssSelector("input[class='gNO89b']"));
	clickbutton.click();
	
	//driver.close();
	}

}
