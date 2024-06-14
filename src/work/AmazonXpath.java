package work;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpath {
	ChromeDriver driver ;
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@Test 
	public void test() {
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		driver.findElement(By.xpath("//input[@name='email'] ")).sendKeys("abc");
		driver.findElement(By.xpath("//span[@id='continue']")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_2']")).click();
		driver.findElement(By.xpath("//a[@data-csa-c-slot-id='HamburgerMenuDesktop']")).click();
	}
	
	
}
