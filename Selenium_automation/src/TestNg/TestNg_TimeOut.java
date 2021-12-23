package TestNg;

import org.testng.annotations.Test;

public class TestNg_TimeOut {
	@Test(enabled=true, timeOut=300)
  public void TimeOut() throws InterruptedException {
		Thread.sleep(220);
		System.out.println("Open browser and enter app url");
		
  }
}
