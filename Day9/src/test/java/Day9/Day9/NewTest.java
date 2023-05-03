package Day9.Day9;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class NewTest {
  @Test(dataProvider =  "dp" , priority=1)
  public void add (int num1, int num2, int expected) {
	  int actual = num1+num2;
	  Assert.assertEquals(expected, actual);
  }
  @Test(dataProvider =  "dp" , priority=2)
  public void sub (int num1,int num2,int expected) {
	  int actual = num1-num2;
	  Assert.assertEquals(actual,expected);
  }
  @DataProvider
  public Object[][] dp(){
	  return new Object[][] {
		new Object[] {1,2,0},
		new Object[] {3,3,0},
		new Object[] {1,2,3}
	};
  }
}



