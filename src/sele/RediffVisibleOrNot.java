package sele;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffVisibleOrNot {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void test() {
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		if(logo.isDisplayed()) {
			System.out.println("Visible");
		}
		else {
			System.out.println("Not Visible");
		}
		
		WebElement check = driver.findElement(By.xpath("//*[@id=\"altid_msg\"]/span"));
		if(check.isSelected()) {
			System.out.println("Selected");
		}
		else {
			System.out.println("Not Selected");
		}
		
		WebElement radio = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
		if(radio.isSelected()) {
			System.out.println("Selected");
		}
		else {
			System.out.println("Not Selected");
		}
	}

}
