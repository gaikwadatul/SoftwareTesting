package automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class add {

	public static void main(String[] args) {
		//open firefox browser
		//System.setProperty("webdriver.gecko.driver", "E:\\Software Testing\\Java\\Workspace\\slenium_Automation\\Execute\\geckodriver.exe");
		//FirefoxDriver fdriver=new FirefoxDriver();
		//fdriver.get("http://www.google.com");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Java\\Workspace\\slenium_Automation\\Execute\\chromedriver.exe");
	    WebDriver cdriver=new ChromeDriver();
	    
	    driver.get("https://www.google.com");
	    
		
	}

}
