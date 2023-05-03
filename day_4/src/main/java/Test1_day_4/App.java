package Test1_day_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static void main( String[] args )
    {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Vijay");
		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Ananth");
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("vijay@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Vijay123");
		driver.findElement(By.xpath("//*[@id=\"form-register\"]/fieldset[3]/div/div")).click();
    }
}
