package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImplicitExplicit {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void url() {
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void test1() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement mouse = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/a"));
		
		Actions act = new Actions(driver);
		act.moveToElement(mouse).perform();
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/div[2]/div[1]/nav[1]/ul/li[1]/a")));
		driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
		
		//shown element not interactable exception therefore code given below used which same as the above .click()
		
//		driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/div[2]/div[1]/nav[1]/ul/li[1]/a")).sendKeys("selenium",Keys.ENTER);
	}

}
