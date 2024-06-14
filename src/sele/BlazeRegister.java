package sele;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeRegister {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void test() {
		driver.findElement(By.name("name")).sendKeys("abc");
		driver.findElement(By.name("company")).sendKeys("avbkdsks");
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("password")).sendKeys("drfg231");
		driver.findElement(By.name("password_confirmation")).sendKeys("drfg231");
	}

}
