package Selenium_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Open_Browser {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Java\\Workspace\\Selenium_automation\\Executable\\chromedriver.exe");
       // ChromeDriver fdriver=new ChromeDriver();
		WebDriver fdriver=new ChromeDriver();
		
		//enter application url
		fdriver.get("https://www.google.com");
		
		//close the browser
		fdriver.close();
		
		//lopen the browser firefox
		System.setProperty("webdriver.gecko.driver", "E:\\Software Testing\\Java\\Workspace\\Selenium_automation\\Executable\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.close();
		
		//open browser interner Explorer
		System.setProperty("webdriver.ie.driver", "E:\\Software Testing\\Java\\Workspace\\Selenium_automation\\Executable\\IEDriverServer.exe");
		WebDriver driver1=new InternetExplorerDriver();
		driver1.get("https://www.google.com");
		driver1.close();
		
	}

}
