package TestDemo;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtendReport {
	ExtentReports report;
	ExtentTest   test;
  
  @BeforeTest
  public void startReport() {
	report = new ExtentReports("./ExtentReport/ExtentReport.html", true);  
    report
          .addSystemInfo("Host name ","Atul")
          .addSystemInfo("Environment  ","dev")
          .addSystemInfo("User name ","Atul Gaikwad");
	
	
  }

  @Test
  public void testCase1() {
	  test= report .startTest("passTest");
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS,"test case is passed");
  }
  
  @Test
  public void testCase2() {
	  test= report .startTest("failTest");
	  Assert.assertTrue(false);
	  test.log(LogStatus.FAIL,"test case is FAIL");
  }
  
  @Test
  public void skipTest() {
	  test= report .startTest("skipTest");
	  Assert.assertTrue(false);
	  test.log(LogStatus.FAIL,"Skipping -this is not ready for testing");
  }
  
  @AfterMethod	
  public void getResul(ITestResult result) {
	  if(result.getStatus()== ITestResult.FAILURE) {
		  test.log(LogStatus.FAIL,"Test case failed is "+result.getName());
		  test.log(LogStatus.FAIL,"Test case failed is "+result.getThrowable());
	 }else if (result.getStatus()==ITestResult.SKIP) {
		 test.log(LogStatus.SKIP,"Test case SKIPPED is "+result.getName());
	}
	  report.endTest(test);
  }
  
  @AfterTest
  public void endReport() {
	report.flush();
	report.close();
  }
}
