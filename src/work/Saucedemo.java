package work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Saucedemo {
	WebDriver driver;
	@BeforeTest 
	public void setup() {
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void url() {
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		File f = new File("D:\\saucedemo.xlsx");
		FileInputStream fi = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sh = wb.getSheet("Sheet1");
		System.out.println(sh.getLastRowNum());
		
		for(int i=1;i<=sh.getLastRowNum();i++) {
			String username = sh.getRow(i).getCell(0).getStringCellValue();
			String password = sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(username+"---"+password);
			
			driver.findElement(By.id("user-name")).clear();
			driver.findElement(By.id("user-name")).sendKeys(username);
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.id("login-button")).click();
			
			String actual = driver.getCurrentUrl();
			System.out.println(actual);
			String expected = "https://www.saucedemo.com/v1/inventory.html";
			if(actual.equals(expected)) {
				System.out.println("Login successful");
			}
			else {
				System.out.println("Login failed");
			}
			driver.navigate().back();
		}
	}

}
