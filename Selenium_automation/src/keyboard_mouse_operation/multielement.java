package keyboard_mouse_operation;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multielement {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
	
		List<WebElement> pagi=driver.findElement(By.cssSelector(".nav-pages>a"));
	  if(pagi.size()>0) {
		  for(int i=0; i<pagi.size();i++) {
			  WebElement nextButton=driver.findElement(By.cssSelector(".pages-next"));
			  if(nextButton.isEnabled()) {
				  nextButton.click();
				  System.out.println(driver.getTitle());
				  
			  }else {
				  System.out.println(driver.getTitle());
			  }
			  pagi = driver.findElement(By.cssSelector(".nav-pages>a"));
				
		  }
	  }
	}

}
