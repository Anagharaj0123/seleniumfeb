package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightAndDoubleClick {
	ChromeDriver driver;
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading() {
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
	}
	@Test
	public void test() {
		
//		RIGHT CLICK
		
		WebElement right = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act = new Actions(driver);
		act.contextClick(right);
		act.perform();
//		WebElement edit = driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"));
//		act.click(edit);
//		act.perform();
		
//		SELECT ELLEMENT
		
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span")).click();
		driver.switchTo().alert().accept();
		
//		DOUBLE CLICK
		
		WebElement doubleClick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(doubleClick);
		act.perform();
		driver.switchTo().alert().accept();
	}

}
