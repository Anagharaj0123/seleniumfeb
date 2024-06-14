package anagha;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLocator {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
	}
	@Test
	public void test() {
		driver.findElement(By.name("username")).sendKeys("meanagharaj@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abc122");
	}
	
}
