package sele;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Test
	public void test() {
		List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println(li.size());
//		datatype is WebElement
		
		for(WebElement w: li) {
			String link = w.getAttribute("href");
			String name = w.getText();
			System.out.println(link+"---"+name);
		}
		
		
	}

}
