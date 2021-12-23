package Utility;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtendReport {

	private static ExtentReports extent;
	
	public synchronized static ExtentReports getReporter(){
	 if(extent==null) {
       String workingDir = System.getProperty("user.dir");
      extent = new ExtentReports(workingDir+"\\ExtentReports\\ExtentReportsResulta.html\\"); 
     //extent = new ExtentReports(workingDir+ "E:\Software Testing\Java\Workspace\MavenTestingProject\ExtentReport",); 
   	
	 }
    	return extent;	   
	}
}
