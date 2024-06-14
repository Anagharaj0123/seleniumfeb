package sele;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertBox {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/ANAGHA%20RAJ/Desktop/Luminar/alert.html");
		driver.manage().window().maximize();
	}
	@Test
	public void test() {
		driver.findElement(By.xpath("/html/body/input[1]")).click();
//		to close alert
//		driver.switchTo().alert().accept();
		
//		if we have multiple tasks to be performed before closing alert
		
		
		Alert a = driver.switchTo().alert();
		String actual = a.getText();
		String expec = "Hello! I'm an alert box!!";
		if(actual.equals(expec)) {
			System.out.println("pass");
			System.out.println(actual);
		}
		else {
			System.out.println("fail");
		}
		a.accept();
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Hello");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("World");
	}
//	@After 
//	public void windowclose() {
//		driver.close();
//	}

}
