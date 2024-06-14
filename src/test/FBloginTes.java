package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FBlogin;

public class FBloginTes {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading() {
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test() {
		FBlogin ob = new FBlogin(driver);
		ob.setvalues("hai@gmail.com", "dvcgja");
		ob.login();
		
	}
}
