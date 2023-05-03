package demo1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest1 {
	int a=20;int b=20;
	int c;
	@Test
	public void add() {
		c=a+b;
		System.out.print(c);
		Assert.assertEquals(c, 40);
	}
	@Test
	public void sub() {
		c=a-b;
		System.out.print(c);
		Assert.assertEquals(c, 0);
	}
	@Test
	public void mul() {
		c=a*b;
		System.out.print(c);
		Assert.assertEquals(c, 400);
	}
	@Test
	public void div() {
		c=a/b;
		System.out.print(c);
		Assert.assertEquals(c, 1);
	}

}
