package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Fbloginpage;

public class Fblogintest {
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
	public void testlogin() {
		Fbloginpage ob = new Fbloginpage(driver);
		ob.setvalues("hello@gmail.com","bkg_09");
		ob.login();
	}
}
