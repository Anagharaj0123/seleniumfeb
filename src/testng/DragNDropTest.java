package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragNDropTest {
	ChromeDriver driver;
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
	}
	@BeforeTest
	public void urlloading() {
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
	}
	@Test
	public void test1() {
		WebElement dragme = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement dropme = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act = new Actions(driver);
		act.dragAndDrop(dragme, dropme);
		act.perform();
		dropme.getText();
		if(dropme.getText().equals("Dropped!")) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
		
	}
}
