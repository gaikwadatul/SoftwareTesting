package Testing_practise;

import java.lang.ref.Cleaner.Cleanable;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class openbrowser {

	public static void main(String[] args) throws InterruptedException {
	//open browser in chrome	
    System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Java\\Workspace\\Testing_Practise\\Executable\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    
         /*open browser in firefox	
         System.setProperty("webdriver.gecko.driver", "E:\\Software Testing\\Java\\Workspace\\Testing_Practise\\Executable\\geckodriver.exe");
         WebDriver driver=new FirefoxDriver();
    
		 open browser in Internet explorer	
	     System.setProperty("webdriver.ie.driver", "E:\\Software Testing\\Java\\Workspace\\Testing_Practise\\Executable\\IEDriverServer.exe");
	     WebDriver driver=new InternetExplorerDriver();   */
    driver.manage().window().maximize();
    driver.get("https://www.google.com");
    driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
    
    
    WebElement entername = driver.findElement(By.name("q"));
    entername.sendKeys("facebook login",Keys.ENTER);
    
    WebElement Searchbtn = driver.findElement(By.linkText("Log In"));
    Searchbtn.click();
   
    //emter the username for fb
    WebElement username  = driver.findElement(By.id("email"));
    username.sendKeys("9665417393");
    //enter the password firld in fb 
    WebElement passwrod  = driver.findElement(By.id("pass"));
    passwrod.sendKeys("A9665417393");
    
    //enter the login in fb
    WebElement loginbtn = driver.findElement(By.id("loginbutton"));
    loginbtn.click();
   
    WebElement account =driver.findElement(By.cssSelector("div[class='oajrlxb2 qu0x051f esr5mh6w e9989ue4 r7d6kgcz nhd2j8a9 p7hjln8o kvgmc6g5 cxmmr5t8 oygrvhab hcukyx3x i1ao9s8h esuyzwwr f1sip0of abiwlrkh p8dawk7l lzcic4wl bp9cbjyn s45kfl79 emlxlaya bkmhp75w spb7xbtv rt8b4zig n8ej3o3l agehan2d sk4xxmp2 rq0escxv j83agx80 taijpn5t jb3vyjys rz4wbd8a qt6c0cv9 a8nywdso l9j0dhe7 qypqp5cg q676j6op tdjehn4e']"));
    account.click();
    Thread.sleep(3000);
   //WebElement logout =driver.findElement(By.cssSelector("span[class='d2edcug0 hpfvmrgz qv66sw1b c1et5uql lr9zc1uh a8c37x1j keod5gw0 nxhoafnm aigsh9s9 fe6kdd0r mau55g9w c8b282yb d3f4x2em iv3no6db jq4qci2q a3bd9o3v ekzkrbhg oo9gr5id hzawbc8m']"));
    WebElement logout =driver.findElement(By.name("Log Out"));
    
    
   logout.click();
   
  
  //  driver.close();

   }
}