package work;




import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Janasya {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void url() {
		driver.get("https://janasya.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void test1() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"CollectionProductGrid\"]/div/toolbar-item/div[2]/div[3]/div[1]/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"CollectionProductGrid\"]/div/toolbar-item/div[2]/div[3]/div[1]/div/ul/li[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[1]/h3")).click();
		driver.findElement(By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[2]/div/ul/li[1]/a")).click();
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--16349892411562__0551e2c3-4916-467e-a6e9-b0d8594a3ff3\"]/header/div/div/div[2]/div/div/div"));
		if(logo.isDisplayed()) {
			System.out.println("Visible");
		}
		else {
			System.out.println("Not Visible");
		}		
		List<WebElement> li = driver.findElements(By.tagName("a"));
		for(WebElement w : li) {
			String links = w.getAttribute("href");
			String name = w.getText();
			System.out.println(links +"------"+name);
		}
		List<WebElement> menu = driver.findElements(By.id("HeaderNavigation"));
		for(WebElement w : menu) {
			String m = w.getText();
			System.out.println(m);
		}
		
		driver.findElement(By.xpath("//*[@id=\"main-collection-product-grid\"]/li[1]/div/div/div[1]/div/div[2]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.name("add")).click();
		driver.findElement(By.xpath("//*[@id=\"halo-cart-sidebar\"]/div[2]/cart-coupon-discount/div/div[3]/div/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"main-cart-items\"]/div/div[2]/form/div/div/a")).click();
		Actions act = new Actions(driver);
		WebElement ethnic = driver.findElement(By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[3]/a"));
		act.moveToElement(ethnic);
		act.perform();
		driver.findElement(By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[3]/ul/li[2]/a")).click();
		

	}
}
