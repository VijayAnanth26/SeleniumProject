package demo1;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class AppTest {
  @Test(priority = 1)
  public void TC_001() {
	  WebDriverManager.chromedriver().setup();
      ChromeOptions co=new ChromeOptions(); 
      co.addArguments("--remote-allow-origins=*");
      WebDriver driver = new ChromeDriver(co);
	  
	  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	  
	  
	  String Title = driver.getTitle();
	  System.out.println(Title);
	  
	  Assert.assertEquals(Title, "Guest Registration Form – User Registration");
  }
}