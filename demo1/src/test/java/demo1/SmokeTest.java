package demo1;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SmokeTest {
  @Test(groups="smoke test")
  public void TC_001() {
	  System.out.println("smoke test :tc_001");
  }
  @Test(groups="regression test")
  public void TC_002() {
	  System.out.println("regression test  :tc_002");
  }
  
  @Test(groups="regression test")
  public void TC_003() {
	  System.out.println("regression test  :tc_003");
  }
//  @BeforeTest
//  public void beforeTest() {
//	  
//  }
//
//  @AfterTest
//  public void afterTest() {
//	  
//  }

}