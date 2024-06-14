package testng;

import java.time.Duration;
import org.testng.Assert;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class AmazonAssignment {
	ChromeDriver driver;
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading() {
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void test1() {
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephones");
		driver.findElement(By.xpath("//*[@id=\"nav-search-bar-form\"]/div[3]/div")).click();
		
		String expec = "Amazon.in : mobilephones";
		String actual = driver.getTitle();
		Assert.assertEquals(expec, actual);
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("parent window title "+driver.getTitle());
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
		Set<String> allwindowhandles = driver.getWindowHandles();
		for(String handle : allwindowhandles) {
			if(!handle.equalsIgnoreCase(parentWindow)) {
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[4]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[38]/div[1]/span/span")).click();
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[8]/div[3]/div[3]/div/div[1]/div[3]/div[1]/div[2]/div[3]/form/span/span/input"))).click();

			}
		}
		
		
	}
		
}
	
	
	

