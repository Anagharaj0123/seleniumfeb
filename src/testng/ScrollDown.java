package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollDown {
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
	public void test() {
		JavascriptExecutor js = (JavascriptExecutor) driver; //common
		
//		defining the pixel
		
	   // js.executeScript("window.scrollBy(0,1000)",""); 
		
//		until element visible
		
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[5]/ul/li[2]/a")));
		
//		to the bottom of the page
		
	  // js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[5]/ul/li[2]/a")).click();
	}

}
