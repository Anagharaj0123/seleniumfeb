package sele;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonJunit {
	ChromeDriver driver;
	@Before
	public void m1() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	public void title() {
		String actualTitle = driver.getTitle();
		String expecTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if(actualTitle.equals(expecTitle)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}
	
	@Test
	public void content() {
		String actualContent = driver.getPageSource();
		if(actualContent.contains("sign in")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}
	
	@After
	public void afterm() {
		driver.close();
	}
}
