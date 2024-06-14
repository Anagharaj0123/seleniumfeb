package anagha;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitlePageSourceJunit {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
	}
	@Test
	public void test() {
		if(driver.getTitle().equals("Instagram"))
			System.out.println("Pass");
		else	
			System.out.println("Fail");
		
		if(driver.getPageSource().contains("Get the app"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
	@After 
	public void  bclose() {
		driver.close();
	}
}
