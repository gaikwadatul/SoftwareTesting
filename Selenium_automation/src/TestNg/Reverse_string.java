package TestNg;

import org.testng.annotations.Test;

public class Reverse_string {
	@Test
	  public void reverse() {
		//  System.out.println("reverse successfully");
         System.out.println(getReverse(new StringBuffer("Banglore")));  
	}
	  
	 StringBuffer getReverse(StringBuffer sb) {
		 return sb.reverse();
	 } 
}

