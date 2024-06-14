package sele;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffTagName {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test() {
		WebElement actual = driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		String expec = "Create my account >>";
		if(actual.getAttribute("value").equals(expec)) {
			System.out.println("Pass");
			System.out.println(actual.getAttribute("value"));
		}
		else {
			System.out.println("Fail");
		}
		}
	

}
