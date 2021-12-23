package TestNg;

import org.testng.annotations.Test;

public class TestNg_Enable {
  @Test(enabled=true)
  public void test() {
	  System.out.println("This is test");
  }
  @Test(enabled=false)
  public void test1() {
	  System.out.println("This is test111");
  }
  @Test(enabled=true)
  public void test2() {
	  System.out.println("This is test2222");
  }
}
