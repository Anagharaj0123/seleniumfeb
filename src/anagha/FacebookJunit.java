package anagha;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookJunit {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void test() {
		driver.findElement(By.name("email")).sendKeys("Hello@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("ahvbdgd_0");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form/div[3]/a")).click();
		driver.navigate().back();
//		driver.findElement(By.tagName("a"))
	}

}
