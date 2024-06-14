package sele;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo2 {
	ChromeDriver driver; //here the value is null
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void test() {
		String actual = driver.getTitle();
		String expected = "Google";
		if(actual.equals(expected)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}
	@Test
	public void test1() {
		String actualcontent = driver.getPageSource();
		String expectedcontent = "Gmail";
		if(actualcontent.equals(expectedcontent)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}
	@After
	public void browserclose() {
		driver.close();
	}

}
