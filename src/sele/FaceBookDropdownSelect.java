package sele;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookDropdownSelect {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
	}
	@Test
	public void test1() {
		driver.findElement(By.name("firstname")).sendKeys("Hello");
		driver.findElement(By.name("lastname")).sendKeys("World");
		driver.findElement(By.name("reg_email__")).sendKeys("helloworld@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("ahdgcb_99");
		
	}
	@Test
	public void test() {
		WebElement day = driver.findElement(By.id("day"));
		Select dayElem = new Select(day);
		dayElem.selectByValue("24");
		List<WebElement> dayCount = dayElem.getOptions();
		System.out.println("day = "+dayCount.size());
		
		WebElement month = driver.findElement(By.id("month"));
		Select monthElem = new Select(month);
		monthElem.selectByValue("1");
		List<WebElement> monthCount = monthElem.getOptions();
		System.out.println("month = "+monthCount.size());
		
		
		WebElement year = driver.findElement(By.id("year"));
		Select yearElem = new Select(year);
		yearElem.selectByValue("2022");
		List<WebElement> yearCount = yearElem.getOptions();
		System.out.println("year = "+yearCount.size());
		
	}

}
