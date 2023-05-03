package Day9.Day9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class NewTest1 {
	WebDriver driver;
  @Test
  public void TC_001() throws InterruptedException{
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  String url = "https://www.godaddy.com/en-in";
	  driver.get(url);
	  driver.manage().window().maximize();
	  Thread.sleep(7000);
	  String gtitle = driver.getTitle();
	  System.out.println("website title is : " + gtitle);
	  String gurl = driver.getCurrentUrl();
	  String title = "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
	  Assert.assertEquals(gtitle, title);
	  Assert.assertEquals(gurl, url);
	  Thread.sleep(7000);
	  driver.quit();
  }
}
