package Test1_day_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		System.out.println("Switch to Child Frame");
		WebElement Drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement Drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act = new Actions(driver);
		act.dragAndDrop(Drag, Drop).build().perform();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		
		driver.quit();
	}
}
