package Testing_practise;

import java.util.concurrent.TimeUnit;

import org.apache.poi.util.Units;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.asm.Advice.Enter;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Java\\Workspace\\Testing_Practise\\Executable\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().getSize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	    driver.get("https://www.google.com/");	
	    //enter the flipkart name and search the website
	    WebElement flipkart= driver.findElement(By.cssSelector("input[class='gLFyf gsfi']"));
	    flipkart.sendKeys("flipkart login",Keys.ENTER);
	    
	    //open the flipkart application
	    WebElement loginurl= driver.findElement(By.cssSelector("div[class='CCgQ5 vCa9Yd QfkTvb MUxGbd v0nnCb']"));
	    loginurl.click();
	    
       //
	    WebElement login= driver.findElement(By.linkText("Login"));
	    login.click();
	    WebElement Username= driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']"));
	    Username.sendKeys("9665417393");
	    WebElement password= driver.findElement(By.cssSelector("input[class='_2IX_2- _3mctLh VJZDxU']"));
	    password.sendKeys("A9890660779");
	    WebElement flipkart_login= driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']"));
	    flipkart_login.click();
	    
	   
	    WebElement slectMobile= driver.findElement(By.xpath("//span[@class='_2I9KP_']"));
	    //slectMobile.isSelected();
	    mouseHover("target", driver, slectMobile, 100, 0);
	    Thread.sleep(2000);
	    mouseHover("targetWithCords", driver, slectMobile, 100, 0);
	    Thread.sleep(2000);
	    mouseHover("cordsOnly", driver, slectMobile, 100, 0);
	    Thread.sleep(2000);
	    
	    
	    
	    
	}

	public static void mouseHover(String hoverOp,WebDriver driver,WebElement element,Integer x, Integer y) {
		Actions action = new Actions(driver);
				if(hoverOp.equalsIgnoreCase("target")) {
				action.moveToElement(element).perform();
			}else if(hoverOp.equalsIgnoreCase("targetWithCords")){
				action.moveToElement(element,x, y).perform();
				
			}else{
				action.moveByOffset(x, y).perform();
				
			}
	    }	


}
