package sele;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffDropdownSelect {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test() {
		driver.manage().window().maximize();
		WebElement w = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select dayElem = new Select(w);
		dayElem.selectByValue("02");
	//to get the count of no.of days
		List<WebElement> dayList = dayElem.getOptions();
		System.out.println("Day count = "+dayList.size());
		
		WebElement we = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select monthElem = new Select(we);
		monthElem.selectByVisibleText("JUN");
	//to get the count of no.of months
		List<WebElement> monthList = monthElem.getOptions();
		System.out.println("Month count = "+monthList.size());
		
		WebElement web = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select yearElem = new Select(web);
		yearElem.selectByIndex(24);
	//to get the count of no.of years
		List<WebElement> yearList = yearElem.getOptions();
		System.out.println("Year count = "+yearList.size());
		
//		Select obj = new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]")));
//		obj.selectByValue("02");
//		Select ob = new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]")));
//		ob.selectByVisibleText("JUN");
//		Select o = new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]")));
//		o.selectByIndex(24);
		
	}
}
