package sele;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotProject {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver  = new ChromeDriver();
	    driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test() throws Exception {
		WebElement dayElem = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		File src1 = dayElem.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File("./screenshot//Elementscreenshot1.png"));
	}

}
