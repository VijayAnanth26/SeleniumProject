package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		driver=new EdgeDriver();
	}
	@Test
	public void Login() throws InterruptedException {
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	 driver.get(url);
	 driver.manage().window().maximize();
	 Thread.sleep(7000);
	 driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
	 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
	 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	 String gurl=driver.getCurrentUrl();
	 String aurl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	 Assert.assertEquals(aurl, gurl);

  }
  @Test(dependsOnMethods = {"Login"})
  public void logout() throws InterruptedException {
 Thread.sleep(7000);
 driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).click();
 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
  }
  @AfterTest
  public void afterTest() throws InterruptedException {
 Thread.sleep(7000);
 driver.quit();
  }
}