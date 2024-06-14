package testng;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssignmentTestAutomation {
	ChromeDriver driver;
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading() {
		driver.get("https://rishiherbalindia.linker.store/");
		driver.manage().window().maximize();
	}
	@Test
	public void test1() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")).sendKeys("Hello@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input")).sendKeys("nfgs6_0");
		driver.findElement(By.xpath("//*[@id=\"register-model-signin-link\"]")).click();
	}
	@Test
	public void test2() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Herbal agro Growth Booster");
	}
	@Test
	public void test3() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement item = driver.findElement(By.xpath("//*[@id=\"featured-carousel\"]/div[1]/div/div[2]/div/div/div[1]/div/a/img"));
		Actions act = new Actions(driver);
		act.moveToElement(item);
		act.perform();
		driver.findElement(By.xpath("//*[@id=\"featured-carousel\"]/div[1]/div/div[2]/div/div/div[1]/div/div[2]/div[2]/ul/li[1]/button/span")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a")).click();
		WebElement skinItem = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img"));
		act.moveToElement(skinItem);
		act.perform();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/div[2]/div[2]/ul/li[1]/button/span")).click();
	}
	@Test
	public void test4() {
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[6]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[7]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[8]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[9]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[10]/a")).click();
	}
	@Test
	public void test5() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[2]/div/ul/li[2]/a")).click();
	}
	@Test
	public void test6() throws Exception {
		WebElement privacyElem = driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[4]/div/ul/li[1]/a"));
		File file = privacyElem.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("./screenshot/Elementscreenshot3.png"));
	}
	@Test
	public void test7() throws Exception {
		URL ob = new URL("https://rishiherbalindia.linker.store/");
		HttpURLConnection con = (HttpURLConnection)ob.openConnection();
		con.connect();
		if(con.getResponseCode()==200) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
	}
	

}
